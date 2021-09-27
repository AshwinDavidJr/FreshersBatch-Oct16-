//------------------------------------------Assignment 1------------------------------------------------------------ 
function checkConst() {
    var a = "i am contstant";
    document.write(" <h3><b>Questiion1 :</b></h3> <br> This is the value of a constant variable and cannot be changed:");
    document.write(a);
    //a = 3;                                                    //Cant be changed as a is constant
}
function checkscope() {
    var a = 2;
    document.write(" <br> <h3> <b> Questiion 2 :</b></h3>");
    if (a > 0) {
        var b = "i have a scope of my if condition";
        document.write(b + "<br>");
    }
    //document.write(b);     //throws error as b is local variable
}
var arrow = function () {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    document.write(" <br> <h3> <b> Questiion 4 : check console...!!</b></h3>");
    var output = [];
    for (var i in names) {
        output.push({
            name: names[i],
            length: names[i].length
        });
    }
    console.log.apply(console, output);
    for (var i in output) {
        document.write(output[i].name + "-" + output[i].length + "<br>");
    }
};
var add = function (a, b) {
    if (a === void 0) { a = 2; }
    if (b === void 0) { b = 3; }
    return a + b;
}; //question 5.a
var userfriends = function (username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    document.write("<br><b>Question 5.b</b> <br><br>user : " + username + "<br> Friends: <br>");
    for (var i in friends) {
        document.write(friends[i]);
    }
};
var printCapitalNames = function () {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var i in names)
        document.write(names[i].toUpperCase() + "<br>");
};
var arrayMatching = function () {
    var arr = ["elm1", "elm2", "elm3", "elm4"];
    var e1 = arr[0], e2 = arr[1], e3 = arr[2], e4 = arr[3];
    document.write("3rd element is : " + e3);
};
var raiseTicket = function () {
    var lapModel = "Ideapad 320";
    var deskNo = 39;
    var uName = "Dikshit";
    document.write("Hi,\n    This is raise a ticket on a issue with my laptop with model name " + lapModel + ". \n    It has been acting wierd and shutting down frequently.The issue also seem to only happen while connected to my desk.\n    My desk no is " + deskNo + " and the plug points are working fine too.\n    hope you look to it as soon as possible.\n    \n    " + uName + "\n    ");
};
//-------------------------------------------------------------------------------------------------------------------
document.write("<br>  <h1><b> Assignment 1 :</b></h1>");
checkConst(); //q1 call
checkscope(); //q2 call
//copyObject();
var n = ["Tom", "harry", "leny"];
arrow.apply(void 0, n); //q4 call
document.write("<br><b> Question 5.a </b> <br> This addition works with default values of 2 and 3...check console to see 5!<br>");
console.log(add()); //q5.a call
userfriends("Rahul", ["keerthi", "sravan", "beck", "ben"]); //q5.b call
var names = ["name1", "name2", "name3"];
document.write("<br><br><b> Question 5.c </b> <br> names using spread..........<br>");
printCapitalNames.apply(void 0, names); //q5.c call
document.write("<br><br><b> Question 6 </b> <br> Using template literals instead of concatenation...!<br> <br>");
raiseTicket(); //q6 call
document.write("<br><br><b> Question 7.a </b> <br> De-structuring done by array matching....!<br>");
arrayMatching(); //q7.a call
//# sourceMappingURL=A1Q.js.map