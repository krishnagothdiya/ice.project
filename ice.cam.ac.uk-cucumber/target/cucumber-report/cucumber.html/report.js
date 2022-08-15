$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("courses.feature");
formatter.feature({
  "line": 2,
  "name": "Courses Test",
  "description": "As user I want to search the courses",
  "id": "courses-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 7431284800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to courses page successfully",
  "description": "",
  "id": "courses-test;user-should-navigate-to-courses-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on courses tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on courses search",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should navigate to courses page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 99267400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMouseHoverOnCoursesTab()"
});
formatter.result({
  "duration": 15700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCoursesSearch()"
});
formatter.result({
  "duration": 8528951200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToCoursesPageSuccessfully()"
});
formatter.result({
  "duration": 14500,
  "status": "passed"
});
formatter.after({
  "duration": 727680900,
  "status": "passed"
});
formatter.before({
  "duration": 4207168300,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should search and apply course successfully",
  "description": "",
  "id": "courses-test;user-should-search-and-apply-course-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I mouse hover on courses tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on courses search",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I search course \"Immunology\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should search courses successfully",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Undergraduate Certificate in Immunology",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on apply now",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter email",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter password",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 14000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMouseHoverOnCoursesTab()"
});
formatter.result({
  "duration": 16400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCoursesSearch()"
});
formatter.result({
  "duration": 953689800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Immunology",
      "offset": 17
    }
  ],
  "location": "MyStepdefs.iSearchCourse(String)"
});
formatter.result({
  "duration": 166733000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSearchCoursesSuccessfully()"
});
formatter.result({
  "duration": 34600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnUndergraduateCertificateInImmunology()"
});
formatter.result({
  "duration": 1915605200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnApplyNow()"
});
formatter.result({
  "duration": 1461033300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterEmail()"
});
formatter.result({
  "duration": 87916000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterPassword()"
});
formatter.result({
  "duration": 85059000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLogin()"
});
formatter.result({
  "duration": 77206200,
  "status": "passed"
});
formatter.after({
  "duration": 724050300,
  "status": "passed"
});
});