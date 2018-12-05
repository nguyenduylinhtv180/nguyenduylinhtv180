# HOMEWORK----- JERSEY-JETTY
# 1) Heroku

 URL: https://linhnd4jerseyjetty.herokuapp.com/



# 2) Description:
## a) Information.class

     String id;
     String content;
     long created_date;
     String created_by;
     long lastupdated_date;
     String lastupdated_by;

## b) RESfulAPI instruction

*Create a new Information:

    POST method to /information

    Body

    {
    "content" : "Information content",
    "created_by" : "username"
    }


*Get Information by Id

    GET method to /information/{id}


*Edit Note by Id

    PUT method to /note/:id

    {
      "content" : "Note content",
      "lastupdated_by" : "username"
    }
*Delete Note By Id

    DELETE method to /note/:id

