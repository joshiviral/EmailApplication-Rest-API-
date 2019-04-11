Create an app to build an email client. A mobile app framework, particularly Angular.js, is
preferred, but you can build it using other methods.
Must have:


1. User interface for inbox, sent folder, archive, and search email by Sender
● Should be able to send, delete, archive, and receive mail.
2. Create your own set of fake data to test the code
3. Build a restful API server as well. The local server should only contain two endpoints on
http://192.168.0.11:8080/email
● MySQL and MongoDB are installed on the machine if you need them.
● MySQL
i. Username: devtest
ii. Pass: devtest
● Mongo
i. In terminal: mongod to run.
ii. Use robo 3t for GUI
● GET list of emails that is sent to the user
● POST whatever information that the mobile app needs to send to the server and
return the same information, with an additional field to indicate that the data is
successfully received by the server.
4. If you aren’t capable of making a restful API ask Cole for access to his API.


Bonus:
1. Spam filter ability (Learn to identify spam automatically), return the ID and the reason why
you think the email is a spam to the server
Remember, this is a test on your development skills, so design of the UI are not as important
but would be nice to see some basic styling. As long as the core functions work, that is the most
important part.