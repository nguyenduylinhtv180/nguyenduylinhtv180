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
    hey -n 100 -c 5 -q 1 -m POST -d '{"conten":"this a","created_by":"linh"}' -H "Content-Type:Application/json" https://linhnd4jerseyjetty.herokuapp.com/information

Summary:
   
      Total:	20.2705 secs
      Slowest:	1.7911 secs
      Fastest:	0.2384 secs
      Average:	0.3336 secs
      Requests/sec:	4.9333
      
      Total data:	21200 bytes
      Size/request:	212 bytes

Response time histogram:
   
      0.238 [1]	|
      0.394 [94]	|■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
      0.549 [0]	|
      0.704 [0]	|
      0.859 [0]	|
      1.015 [0]	|
      1.170 [0]	|
      1.325 [0]	|
      1.481 [0]	|
      1.636 [0]	|
      1.791 [5]	|■■


Latency distribution:
   
      10% in 0.2439 secs
      25% in 0.2487 secs
      50% in 0.2569 secs
      75% in 0.2698 secs
      90% in 0.2859 secs
      95% in 1.7064 secs
      99% in 1.7911 secs

Details (average, fastest, slowest):
   
      DNS+dialup:	0.0739 secs, 0.2384 secs, 1.7911 secs
      DNS-lookup:	0.0361 secs, 0.0000 secs, 0.7219 secs
      req write:	0.0000 secs, 0.0000 secs, 0.0001 secs
      resp wait:	0.2595 secs, 0.2382 secs, 0.3378 secs
      resp read:	0.0001 secs, 0.0000 secs, 0.0002 secs

Status code distribution:
    
      [200]	50 responses
      [429]	50 responses
