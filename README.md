# polls-api
A Polls API written in Java (Spring Boot) with authentication and authorization based on JWT.
## Endpoints:
POST http://localhost:5000/api/auth/signin

POST http://localhost:5000/api/auth/signup

GET http://localhost:5000/api/polls

POST http://localhost:5000/api/polls

GET http://localhost:5000/api/polls/{{pollId}}

POST http://localhost:5000/api/polls/{{pollId}}/votes

GET http://localhost:5000/api/user/me

GET http://localhost:5000/api/user/checkUsernameAvailability

GET http://localhost:5000/api/user/checkEmailAvailability

GET http://localhost:5000/api/users/{{username}}

GET http://localhost:5000/api/users/{{username}}/polls

GET http://localhost:5000/api/users/{{username}}/votes
