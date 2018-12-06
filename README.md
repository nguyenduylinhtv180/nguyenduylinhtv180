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

##3) Test with Hey
Summary:
      Total:	30.4362 secs
      Slowest:	1.2806 secs
      Fastest:	0.2483 secs
      Average:	0.3222 secs
      Requests/sec:	9.8567
      
      Total data:	63238 bytes
      Size/request:	210 bytes

Response time histogram:
     
      0.248 [1]	|      
      0.352 [265]	|■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
      0.455 [24]	|■■■■
      0.558 [0]	|
      0.661 [0]	|
      0.764 [0]	|
      0.868 [0]	|
      0.971 [0]	|
      1.074 [0]	|
      1.177 [4]	|■
      1.281 [6]	|■


Latency distribution:
    
      10% in 0.2572 secs
      25% in 0.2681 secs
      50% in 0.2859 secs
      75% in 0.3081 secs
      90% in 0.3670 secs
      95% in 0.4128 secs
      99% in 1.2081 secs

Details (average, fastest, slowest):
     
      DNS+dialup:	0.0289 secs, 0.2483 secs, 1.2806 secs
      DNS-lookup:	0.0032 secs, 0.0000 secs, 0.0963 secs
      req write:	0.0000 secs, 0.0000 secs, 0.0002 secs
      resp wait:	0.2931 secs, 0.2482 secs, 0.4356 secs
      resp read:	0.0001 secs, 0.0001 secs, 0.0001 secs

Status code distribution:
      
      [200]	151 responses
      [429]	149 responses
