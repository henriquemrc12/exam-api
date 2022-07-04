# Exam Api
A Exam Demo Api

## Routes

## Subjects
##### POST `/subjects`
##### BODY
```json
{
    "name": "string"
}
```

##### PUT `/subjects`
##### BODY
```json
{
    "id": 12,
    "name": "string"
}
```

##### GET `/subjects/{subjectId}`
##### RESPONSE
```json
{
    "id": 12,
    "name": "string"
}
```

##### GET `/subjects`
##### RESPONSE
```json
[
  {
    "id": 12,
    "name": "string"
  },
  {
    "id": 12,
    "name": "string"
  }
]
```
##### DELETE `/subjects/{subjectId}`
##### NOT CONTENT IN RESPONSE

## Exams
##### POST `/exams`
##### BODY 
```json
{
    "name": "string",
    "year": 2022,
    "subjectId": 2
}
```

##### PUT `/exams`
##### BODY
```json
{
    "id": 12,
    "name": "string",
    "year": 2022,
    "subjectId": 2
}
```

##### GET `/exams/{examId}`
##### RESPONSE
```json
{
    "id": 12,
    "name": "string",
    "year": 2022,
    "subject": {
      "id": 21,
      "name": "string"
    }
}
```


##### GET `/exams`
##### RESPONSE
```json
[
    {
      "id": 12,
      "name": "string",
      "year": 2022,
      "subject": {
        "id": 21,
        "name": "string"
        }
    },
    {
      "id": 12,
      "name": "string",
      "year": 2022,
      "subject": {
        "id": 21,
        "name": "string"
      }
    }
]
```
##### DELETE `/exams/{examId}`
##### NOT CONTENT IN RESPONSE