1. Download Kafka from official site https://kafka.apache.org/downloads.
2. Extract the file and move to the extracted folder.
3. In kafka directory open command prompt and type `.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`.
4. Open new command window and type `.\bin\windows\kafka-server-start.bat .\config\server.properties`.
5. Now u can run consumer and producer apps.
6. For testing you need to send post request to `http://localhost:8081/api/v1/file`

   
   example
   ```
   {
    "filePath": "filePath",
    "couponId": 52356874,
    "offersIds": [5]
   }
