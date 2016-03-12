@Post
Feature: User is posting note


Background:
* User is on login page
* User enters "inportia_batch01@yopmail.com" and "123456"


@post_01 @wip
Scenario: User is trying to post note to group
* Click on the NOTE tab
* Enter your message in textbox
* Select the recipients from dropdown list
* Send the note
* Verify if note is seen