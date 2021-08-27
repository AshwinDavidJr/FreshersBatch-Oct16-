/* to use mongoimport

1.download mongodb-tools.zip

2.copy the files(.exe files) in bin folder of unzipped file to the 
bin folder of your mongosh main folder. (optional)

3.open mongoshell and connect to your atlas

4.open another command prompt and change directory to the folder with files mentioned in step 2.

5.open atlas, select the cluster, choose 3 dots and select command line tools.

6.copy paste the command for import in the command prompt(step 4). 
Make sure you change the requiredfiels with actual data (password,type,filepath etc).

7.provide the path of your json file

8 execute the command.

*/

//-------------Atlanta Population-----------------
1. db.zipcodes.find({city:"ATLANTA"})
2. db.zipcodes.aggregate({$match:{city:"ATLANTA"}})
3. db.zipcodes.aggregate([
	{$match:{city:"ATLANTA"}},
	{$group:{_id:"$_id"}},
	{$count:"total zipcodes"}
   ])
4.db.zipcodes.aggregate([
	{$match:{city:"ATLANTA"}},
	{$group:{_id:"$city",totalpop:{$sum: "$pop"}}
    ])

//-----------------Population by state-------------------------------

1.db.zipcodes.aggregate([
	{$group:{_id:"$state", totalpop:{$sum:"$pop"}}}
	])
2.db.zipcodes.aggregate([
	{$group:{_id:"$state", totalpop:{$sum:"$pop"}}},
	{$sort:{totalpop : -1}}
	])
3.db.zipcodes.aggregate([
	{$group:{_id:"$state", totalpop:{$sum:"$pop"}}},
	{$sort:{totalpop : -1}},
	{$limit:3}
	])
//top 3 highest populated state = CA>NY>TX

//--------------------population by city----------------------------------
1.db.zipcodes.aggregate([
	{$group:{_id:{city:"$city",state:"$state"}, totalpop:{$sum:"$pop"}}}
	])
2.db.zipcodes.aggregate([
	{$group:{_id:{city:"$city",state:"$state"}, totalpop:{$sum:"$pop"}}},
	{$sort:{totalpop : -1}}
	])
3.db.zipcodes.aggregate([
	{$group:{_id:{city:"$city",state:"$state"}, totalpop:{$sum:"$pop"}}},
	{$sort:{totalpop : -1}},
	{$limit:3}
	])
	// chicago>brooklyn>LA
4.db.zipcodes.aggregate([
	{$match:{state:"TX"}},
	{$group:{_id:{city:"$city",state:"$state"}, totalpop:{$sum:"$pop"}}},
	{$sort:{totalpop : -1}},
	{$limit:3}
	])
	//HOuston>dallas>san antonio

//----------------bonus------------------------------------------------------
1.db.zipcodes.aggregate([
	{$group:{_id:{city:"$city",state:"$state"}, AVGpop:{$avg:"$pop"}}}
	])
2.db.zipcodes.aggregate([
	{$group:{_id:"$state", AVGpop:{$avg:"$pop"}}},
	{$sort:{totalpop : -1}},
	{$limit:3}
	])

//CT>MD>NC



