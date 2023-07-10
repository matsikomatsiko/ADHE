# ADHE
MBARARA UNIVERSITY OF SCIENCE AND TECHNOLOGY
FACULTY OF COMPUTING AND INFORMATICS
MASTER OF SCIENCE IN HEALTH INFORMATION TECHNOLOGY
Diabetic Patient Adherence App
Mwebembezi Fred 2022/MHIT/014/PS
Matsiko Winston 2022/MHIT/018/PS
Tusasiibwe Ivan 2022/MHIT/007/PS
Introduction
The Diabetic Patient Adherence App is a mobile application developed to address the challenges faced by diabetic patients in managing their condition effectively. The app aims to improve patient adherence to treatment plans by providing features such as medication tracking, diet management, appointment scheduling, health information provision, personal health record maintenance, and growth status tracking. The Diabetic Patient Adherence App was developed to assist diabetic patients in managing their condition by providing a user-friendly platform that promotes adherence to treatment plans and self-management.
This report provides an overview of the app's objectives, features, technical implementation, usability, security considerations, and conclusions based on the app's development and deployment.
Problem Statement
Diabetes is a chronic condition that requires regular monitoring, medication adherence, and lifestyle modifications for effective management. Non-adherence to medication, diet, exercise, and regular check-ups can lead to complications and suboptimal management of diabetes. Therefore, there is a need for an intuitive and user-friendly mobile application that helps diabetic patients track and manage their condition while promoting adherence to their treatment plan.
Objectives 
To improve diabetic medication adherence, diet management, appointment scheduling, health information provision, personal health record maintenance, growth status tracking and receive timely reminders.
Methods
App Development Process
The app was developed following an iterative approach that included requirements gathering, design, development, testing, and deployment. User feedback and usability testing were incorporated to ensure a user-friendly experience.
Technology Stack
The app was developed using Java programming language for the Android platform. XML files were utilized for defining the app's layout and screen components. The app leverages a local database for data storage and retrieval.
App Features
The app offers a range of features to address the specific objectives:
Medication Adherence:
Medication tracking and reminders
Dosage and timing management
History and progress tracking
Diet Management:
Meal planning and tracking
Carbohydrate and calorie counting
Nutritional information and guidance
Personalized diet recommendations
Appointment Scheduling:
Appointment creation and management
Reminder notifications
Integration with the calendar for seamless scheduling
Health Information:
Access to educational resources on diabetes management
Information on symptoms, complications, and lifestyle modifications
Tips for managing stress and maintaining emotional well-being
Personal Health Records:
Secure storage and access to medical history
Growth status tracking (weight, blood glucose levels, physical activity)
Note-taking feature for capturing personal observations and concerns
Growth Status Tracking:
Tracking of key health parameters (blood glucose levels, weight, physical activity)
Visualizations and trends analysis
Alerts for abnormal readings
Technical Implementation:
AndroidManifest.xml: The AndroidManifest.xml file defines the app's components, permissions, and configurations.
XML Layout Files: The XML layout files define the visual structure and user interface of the app's screens, such as appointment.xml, medication.xml, diet.xml, etc.
Database Management: The app utilizes a local database managed by the DBHelper class to store and retrieve user data, including medication records, diet information, appointments, and personal health records.
Usability, Security, and Privacy Considerations: The app prioritizes usability by providing an intuitive interface, clear instructions, and customizable settings. Security measures, such as encryption of sensitive data and user authentication, are implemented to protect user privacy. Compliance with data protection regulations is ensured and user consent is obtained for data collection and usage.
Challenges
•	Database Integration: Integrating a database and ensuring its proper functioning was challenging. We encountered difficulties in establishing the database connection, designing an efficient schema, managing data synchronization and handling database errors.
•	Data Security and Privacy: Developing a secure app to protect sensitive medical data posed significant challenges. Implementing encryption, secure authentication mechanisms and adhering to privacy regulations required a thorough understanding of security best practices and attention to detail.
•	Device Compatibility and Fragmentation: Android devices come in various screen sizes, resolutions, and hardware configurations. Ensuring compatibility across different devices, Android versions, and screen densities required rigorous testing and adaptation of user interface elements to provide a consistent experience.
Conclusion
In conclusion, the Diabetic Patient Adherence App has been successfully developed to address the challenges faced by diabetic patients in managing their condition effectively. By providing features for medication adherence, diet management, appointment scheduling, health information provision, personal health record maintenance, growth status tracking, and customization, the app aims to empower patients, improve adherence, and enhance disease management. Through its user-friendly interface, the app facilitates self-management and promotes better health outcomes for diabetic patients.
