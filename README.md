# PlattformQA
Information portal for experts
Description
The Expert Information Portal is a web application designed to bring together experts in various fields to share knowledge and experience. The portal provides convenient tools for searching for information, interacting with other experts and publishing articles.

Project functionality
- Registration and authentication of users (experts).
- Sections for publishing and reading articles.
- Comments and ratings.
- Search for experts and articles.
- Administrative panel for content management

Requirements

- Additional tools: Postman for API testing, Jenkins for CI/CD, Selenium for test automation,TestLink for documentation of bugs,State Transition diagram for analysis,Test Plan for planning every step of the user,Jira for bugreports.

Testing

1. Test planning and control
   - As part of testing, a state transition diagram was created to analyze states and transitions in the system (for example, from user registration to article publication) (
https://drive.google.com/file/d/1D3o2Ff2-3M1MM07cw0lXSg7Nmp2raHXQ/view?usp=sharing
).
   - The test plan describes the types of tests: functional, integration and load
(
https://docs.google.com/document/d/1Etw3t4ZM6qT_4Fga8lP8aPd0TKWXeprHqgjEtxXcBGo/edit?usp=sharing
).
   - Tests cover basic user scenarios: registration, article search, interaction with content.
2. Automated tests
   - To automate tests, Selenium WebDriver was used for browser testing.
   - Running autotests:
npm run test
3. Test documentation
   - Test Link contains a list of all tests and their statuses(
https://docs.google.com/spreadsheets/d/1e14Z8MYMYPxkqM3saGzY-m_rCPCUdMSl/edit?usp=sharing&ouid=102756986881671672292&rtpof=true&sd=true
). 
- Test statuses are tracked in a test management system.
4. Bug Reports
   - If errors were identified, they were recorded in Jira. A complete list of bug reports and their statuses can be found at (1.https://docs.google.com/document/d/1j5EzFIwZb6WPFukmu1mVj3k5pSeOSBEM/edit?usp=sharing&ouid=102756986881671672292&rtpof=true&sd=true
2.https://docs.google.com/document/d/1mBdH5HwTOMeXmCtN9hNujP273fo7gH89/edit?usp=sharing&ouid=102756986881671672292&rtpof=true&sd=true
3.https://docs.google.com/document/d/1S8moy2kV0JsPWxwX-aNNgr43KAIweWfv/edit?usp=sharing&ouid=102756986881671672292&rtpof=true&sd=true
). 

Known Bugs
- When working with certain versions of browsers, problems with displaying content may occur.
- Errors may occur when registering with non-standard email domains.
Authors and contacts
- QA engineer: [Anastasiia Hryhorenko , Akmoor Zabytakhunova]  
  For questions about testing the project or detecting bugs, please contact us by email: hryhorenast@gmail.com
160403007akuwa@gmail.com 



