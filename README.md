# VIT-CHATBOT-PROJECT
“Smart Student Query Chatbot for VIT Bhopal”
**VIT Chatbot Project – Java Console Application**
This project is a simple Java-based chatbot designed to help VIT students get quick answers to common academic and administrative queries. The chatbot uses an internal FAQ database and returns relevant answers based on the user's question. The project includes three major modules: the Chatbot Module, FAQ Database Module, and Admin Module.
**Features**
1.Simple console-based chatbot.
2.Internal FAQ database using ArrayList.
3.Admin panel to add new FAQs.
4.Lightweight and beginner-friendly.
5.Clean and modular Java code.

**Modules**
1. Chatbot Module (Main.java):
Handles user questions and displays answers.
2. FAQ Database Module (FAQDatabase.java & FAQItem.java):
Stores questions and answers.
3. Admin Module (AdminPanel.java):
Allows new FAQ entries to be added manually.

**System Architecture**
User → Main.java → FAQDatabase → FAQItem → Response
(Architecture diagram included in diagrams folder.)

**How to Run**
1.Open any Java IDE such as IntelliJ IDEA / Eclipse OR run on online Java compiler.
2.Compile all .java files.
3.Run Main.java to use the chatbot.
4.Run AdminPanel.java to add new FAQ entries.

**Project Structure**
VIT-CHATBOT-PROJECT/
│── Main.java
│── FAQDatabase.java
│── FAQItem.java
│── AdminPanel.java
│── statement.md
│── README.md
│── report.pdf
│── diagrams/
       ├── use_case.png
       ├── workflow.png
       ├── class_diagram.png
       ├── architecture.png
