# cr-car-rental-system

Question :Design and implement a car rental system using object-oriented principles. 
The system should allow reserving a car of a given type at a desired date and time for a given number of days. There are 3 types of cars (sedan, SUV and van).
The number of cars of each type is limited.
Use java as the implementation language. Prove that the system satisfies the requirements.


Project Details: 


Pre-requisite:
Java and maven must be installed.

Steps:
1. Clone git repo.
2. Go to project directory.
3.  run command “mvn clean install”
4. Cd target/
5. Run command “java -jar cr-car-rental-system-0.0.1-SNAPSHOT-exec.jar”

Available APIs:

1. Get Available cars : (/getAvailableCars)
	curl -X GET http://localhost:8080/getAvailableCars 

	sample response: [{"type":"CAR","subType":"SEDAN","availableQty":10},{"type":"CAR","subType":"SUV","availableQty":10},{"type":"CAR","subType":"VAN","availableQty":10}]

2. Book cars :
	request sample: 
        {
		"customer":{
		"firstName":"Divyanshu",
		"lastName" : "Shekhar",
		"dateOfBirth" : "1986-12-4"
	},
	"vehicle" : [
			{
				"vehicleType" :"SEDAN",
				"fromDate": "2018-10-12",
				"fromTime":"06:00:00",
				"noOfDays":"10"
			},
			{
				"vehicleType" :"SUV",
				"fromDate": "2018-10-12",
				"fromTime":"06:00:00",
				"noOfDays":"1"
			}
		]
         }

Curl command : 
  curl -X POST \
  http://localhost:8080/book \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
	"customer":{
		"firstName":"Divyanshu",
		"lastName" : "Shekhar",
		"dateOfBirth" : "1986-12-4"
	},
	"vehicle" : [
			{
				"vehicleType" :"SEDAN",
				"fromDate": "2018-10-12",
				"fromTime":"06:00:00",
				"noOfDays":"10"
			},
			{
				"vehicleType" :"SUV",
				"fromDate": "2018-10-12",
				"fromTime":"06:00:00",
				"noOfDays":"1"
			}
		]
}'


Response sample :
   {
    "errorMessage": null,
    "data": [
        {
            "vehicleType": "SEDAN",
            "fromDate": "2018-10-12",
            "fromTime": "06:00:00",
            "noOfDays": "10",
            "bookingReferenceNumber": "50047898-1bee-4b23-a4eb-f90697e73562"
        },
        {
            "vehicleType": "SUV",
            "fromDate": "2018-10-12",
            "fromTime": "06:00:00",
            "noOfDays": "1",
            "bookingReferenceNumber": "9967c7dc-2d50-4090-80de-0cfdb366c6c8"
        }
    ],
    "error": false
}

3. Get booking by reference Number:
	curl command :
		curl -X POST \
  			http://localhost:8080/getBookingDetail \
  			-H 'bookingreferencenumbers: 50047898-1bee-4b23-a4eb-f90697e73562' 

       Response sample:
      [
    {
        "customer": {
            "firstName": "Divyanshu",
            "lastName": "Shekhar",
            "dateOfBirth": "1986-12-4"
        },
        "vehicleType": "CAR",
        "vehicleSubType": "SEDAN",
        "startDateTime": "2018-10-12T06:00:00",
        "endDateTime": "2018-10-22T06:00:00",
        "bookingReferenceNumber": "50047898-1bee-4b23-a4eb-f90697e73562"
    }
]
     

