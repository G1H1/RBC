# RBC
Project coded using Java, Java8, Spring boot(MVC model, Web services, AOP, Filterring and Profiles etc), SL4J, Log4j, Postman etc. 

Due to time contrain I was unable to implement Docket, SQL, Global exceptions, actuators etc. 

Postman JSON collections:

{
	"info": {
		"_postman_id": "83ec1264-21ba-4671-93ad-9101b313bf2e",
		"name": "RBC",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "23940982"
	},
	"item": [
		{
			"name": "Status",
			"request": {
				"method": "GET",
				"header": [
					{
						"key": "clientId",
						"value": "abc123",
						"type": "text"
					}
				],
				"url": {
					"raw": "http://localhost:8080/status",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"status"
					]
				}
			},
			"response": []
		},
		{
			"name": "Search",
			"request": {
				"method": "GET",
				"header": [
					{
						"key": "clientId",
						"value": "abc123",
						"type": "text"
					}
				],
				"url": {
					"raw": "http://localhost:8080/find/AX",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"find",
						"AX"
					]
				}
			},
			"response": []
		},
		{
			"name": "Batch insert",
			"request": {
				"method": "POST",
				"header": [
					{
						"key": "clientId",
						"value": "123abc",
						"type": "text"
					}
				],
				"body": {
					"mode": "raw",
					"raw": "[{\r\n  \"quarter\":\"1\",\r\n  \"stock\":\"A\",\r\n  \"date\":\"01/14/2011\",\r\n  \"open\":\"$16.71\",\r\n  \"high\":\"$16.71\",\r\n  \"low\":\"$15.64\",\r\n  \"close\":\"$15.97\",\r\n  \"volume\":\"242963398\",\r\n  \"percentChangePrice\":\"-4.42849\",\r\n  \"percentChangeVolumeOverLastWk\":\"1.380223028\",\r\n  \"previousWeeksVolume\":\"239655616\",\r\n  \"nextWeeksOpen\":\"$16.19\",\r\n  \"nextWeeksClose\":\"$15.79\",\r\n  \"percentChangeNextWeeksPrice\":\"-2.47066\",\r\n  \"daysToNextDividend\":\"19\",\r\n  \"percentReturnNextDividend\":\"0.187852\"\r\n},\r\n{\r\n  \"quarter\":\"1\",\r\n  \"stock\":\"XX\",\r\n  \"date\":\"01/14/2011\",\r\n  \"open\":\"$16.71\",\r\n  \"high\":\"$16.71\",\r\n  \"low\":\"$15.64\",\r\n  \"close\":\"$15.97\",\r\n  \"volume\":\"242963398\",\r\n  \"percentChangePrice\":\"-4.42849\",\r\n  \"percentChangeVolumeOverLastWk\":\"1.380223028\",\r\n  \"previousWeeksVolume\":\"239655616\",\r\n  \"nextWeeksOpen\":\"$16.19\",\r\n  \"nextWeeksClose\":\"$15.79\",\r\n  \"percentChangeNextWeeksPrice\":\"-2.47066\",\r\n  \"daysToNextDividend\":\"19\",\r\n  \"percentReturnNextDividend\":\"0.187852\"\r\n}]",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/batchUpload",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"batchUpload"
					]
				}
			},
			"response": []
		},
		{
			"name": "Individual add",
			"request": {
				"method": "POST",
				"header": [
					{
						"key": "clientId",
						"value": "abc123",
						"type": "text"
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\r\n  \"quarter\":\"10\",\r\n  \"stock\":\"AX\",\r\n  \"date\":\"01/14/2011\",\r\n  \"open\":\"$16.71\",\r\n  \"high\":\"$16.71\",\r\n  \"low\":\"$15.64\",\r\n  \"close\":\"$15.97\",\r\n  \"volume\":\"242963398\",\r\n  \"percentChangePrice\":\"-4.42849\",\r\n  \"percentChangeVolumeOverLastWk\":\"1.380223028\",\r\n  \"previousWeeksVolume\":\"239655616\",\r\n  \"nextWeeksOpen\":\"$16.19\",\r\n  \"nextWeeksClose\":\"$15.79\",\r\n  \"percentChangeNextWeeksPrice\":\"-2.47066\",\r\n  \"daysToNextDividend\":\"19\",\r\n  \"percentReturnNextDividend\":\"0.187852\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/addIndividual",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"addIndividual"
					]
				}
			},
			"response": []
		}
	]
}
