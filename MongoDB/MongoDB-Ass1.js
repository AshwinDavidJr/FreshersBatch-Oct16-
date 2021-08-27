5.db.movies.find({year:{$gte:1900,$lt:2000}})
6.db.movies.find({$or:[{year:{$lt:2000}},{year:{$gt:2010}}]})
7. db.movies.updateOne({title:"The hobbit and unexpected journey"},{$set:{synopsis:"A reluctant hobbit bilbo baggins, sets out to the lonely mountain with spirited group of dwarves to reclain their mountain home - and the gold within it - from the dragon smaug"}})
8. db.movies.updateOne({title:"The hobbit: The desolation of smaug"},{$set:{synopsis:"The swarves along with bilbo baggins and gandhalf the grey, continue their quest to reclaim Erebor, their homeland, from smaug. bilbo baggins is in the possesion of mysterious and magical ring."}})
9. db.movies.update(
   { title:"pulp fiction" },
   { $push: { actors:"Samuel L Jackson" } }
)



text search*/
db.movies.createIndex( { synopsis: "text" } )
	

1.db.movies.find( { $text: { $search: "bilbo" } } )

2.db.movies.find( { $text: { $search: "gandhalf" } } )

3. db.movies.find( { $text: { $search: "bilbo -Gandhalf" } } )

4.db.movies.find( { $text: { $search: "dwarfes hobbit" } } )
5.db.movies.find( { $text: { $search:"\"gold\" \"dragon\"" } } )


Deletion*/

db.movies.deleteOne({title:"Pee Wee Herman's Big Adventure"})
db.movies.deleteOne({title:"Avatar"})