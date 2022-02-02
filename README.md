# CS425-SWE

## Login
POST localhost/login
```
{
 "username":"sai",
 "password":"password"
}
```

## Get Approved course
get localhost/approved-list?username=sai
```
[{
  "blockName":"April 2022",
  "courseCode":"CS390",
  "courseName":"Compro Entry Group",
  "facultyName":"Sai",
  "startDate":"2022-12-01T00:00:00"
},{
  "blockName":"April 2022",
  "courseCode":"CS390",
  "courseName":"Compro Entry Group",
  "facultyName":"Sai",
  "startDate":"2022-12-01T00:00:00"
}]
```

## get course with block
get localhost/courses?username=sai
```
{
"endTime":"2022-12-01T00:00:00",
"offering":[{
  "id":10, //offering id
  "blockID":1,
  "courseName":"Compro Entry Group",
},{
  "id":10, //offering id
  "blockID":2,
  "courseName":"Compro Entry Group",
}]
}
```
## post course with block and priority
post localhost/courses-register
```
{
"username":"sai",
"data":[{
  "id":10, //offering id
  "priority":1,
  "blockID":1,
},{
  "id":10, //offering id
  "priority":2,
  "blockID":2,
}]
}
```
