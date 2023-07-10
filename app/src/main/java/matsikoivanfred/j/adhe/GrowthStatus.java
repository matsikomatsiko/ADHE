package matsikoivanfred.j.adhe;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.tensorflow.lite.Interpreter;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GrowthStatus extends Activity {
    private TextView prevWeight;
    private TextView presentWeight;
    private TextView prevHeight;
    private TextView presentHeight;
    private TextView prevBloodSugar;
    private TextView presentBloodSugar;
    private TextView presentBloodPressure;
    private TextView prevBloodPressure;
    private DBHelper dbHelper;
    private Interpreter smartReplyInterpreter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.growth_status);

        prevWeight = findViewById(R.id.tvPrevWeight);
        presentWeight = findViewById(R.id.tvPresentWeight);
        prevHeight = findViewById(R.id.tvPrevHeight);
        presentHeight = findViewById(R.id.tvPresentHeight);
        prevBloodSugar = findViewById(R.id.tvPrevSugar);
        presentBloodSugar = findViewById(R.id.tvPresentSugar);
        presentBloodPressure = findViewById(R.id.tvPresentBloodPressure);
        prevBloodPressure = findViewById(R.id.tvPrevBloodPressure);

        Intent intent = getIntent();
        int profileId = intent.getIntExtra("profile_id", 0);

        dbHelper = new DBHelper(getApplicationContext());
        HashMap<String, String> map = dbHelper.getAboutOneProfile(profileId);

        Toast.makeText(getApplicationContext(), "" + map.get("weight"), Toast.LENGTH_SHORT).show();
        prevWeight.setText(map.get("weight_prev") + " Kg");
        presentWeight.setText(map.get("weight") + " Kg");
        prevHeight.setText(map.get("height_prev") + " inches");
        presentHeight.setText(map.get("height") + " inches");
        prevBloodSugar.setText(map.get("suger_prev") + " mmol/L");
        presentBloodSugar.setText(map.get("blood_suger") + " mmol/L");
        presentBloodPressure.setText(map.get("high_pressure_desc") + " mmHg");
        prevBloodPressure.setText(map.get("high_pressure_prev") + " mmHg");

        try {
            smartReplyInterpreter = new Interpreter(loadModelFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private MappedByteBuffer loadModelFile() throws IOException {
        AssetFileDescriptor fileDescriptor = getAssets().openFd("smartreply.tflite");
        FileInputStream inputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
        FileChannel fileChannel = inputStream.getChannel();
        long startOffset = fileDescriptor.getStartOffset();
        long declaredLength = fileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
    }

    public void generateSmartReplies(View view) {
        String inputText = "Hello, how are you?"; // Replace with the actual input text

        List<String> smartReplies = getSmartReplies(inputText);
        for (String reply : smartReplies) {
            Toast.makeText(getApplicationContext(), reply, Toast.LENGTH_SHORT).show();
        }
    }

    private List<String> getSmartReplies(String inputText) {
        List<String> smartReplies = new ArrayList<>();

        // Preprocess the input text (if needed) before passing it to the model

        // Run inference on the Smart Reply model
        float[][] input = preprocessInput(inputText);  // Preprocess the input text as per model requirements
        float[][] output = new float[1][3];  // Assuming the model returns 3 replies

        smartReplyInterpreter.run(input, output);

        // Postprocess the model output to obtain the smart replies
        for (float[] reply : output) {
            String smartReply = postprocessOutput(reply);  // Postprocess the output as per model requirements
            smartReplies.add(smartReply);
        }

        return smartReplies;
    }

    // Helper methods for preprocessing and postprocessing can be implemented here

    private float[][] preprocessInput(String inputText) {
        // Implement the preprocessing logic for the input text and convert it to the required format
        return new float[1][inputText.length()]; // Replace with the actual preprocessing logic
    }

    private String postprocessOutput(float[] reply) {
        // Implement the postprocessing logic for the model output and convert it to a readable reply
        return "smartreply "; // Replace with the actual postprocessing logic
    }
}
