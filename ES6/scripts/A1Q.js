//------------------------------------------Assignment 1------------------------------------------------------------ 
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
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
var raiseTicket = function () {
    var lapModel = "Ideapad 320";
    var deskNo = 39;
    var uName = "Dikshit";
    document.write("Hi,\n    This is raise a ticket on a issue with my laptop with model name " + lapModel + ". \n    It has been acting wierd and shutting down frequently.The issue also seem to only happen while connected to my desk.\n    My desk no is " + deskNo + " and the plug points are working fine too.\n    hope you look to it as soon as possible.\n    \n    " + uName + "\n    ");
};
var arrayMatching = function () {
    var arr = ["elm1", "elm2", "elm3", "elm4"];
    var e1 = arr[0], e2 = arr[1], e3 = arr[2], e4 = arr[3];
    document.write("3rd element is : " + e3);
};
function classexample1() {
    var Account = /** @class */ (function () {
        function Account(id, name, balance) {
            this.id = id;
            this.balance = balance;
            this.name = name;
        }
        return Account;
    }());
    var SavingAccount = /** @class */ (function (_super) {
        __extends(SavingAccount, _super);
        function SavingAccount(id, name, balance) {
            var _this = _super.call(this, id, name, balance) || this;
            _this.intrest = .02;
            _this.balance = _this.balance + (_this.balance * _this.intrest);
            return _this;
        }
        return SavingAccount;
    }(Account));
    var CurrentAccount = /** @class */ (function (_super) {
        __extends(CurrentAccount, _super);
        function CurrentAccount(id, name, balance) {
            var _this = _super.call(this, id, name, balance) || this;
            _this.cash_credit = 1000;
            _this.balance += _this.cash_credit;
            return _this;
        }
        return CurrentAccount;
    }(Account));
    var acc1 = new SavingAccount(1001, "Holder1", 10000);
    var acc2 = new CurrentAccount(1002, "Holder2", 15000);
    var sum = 0;
    sum = acc1.balance + acc2.balance;
    console.log(sum);
    document.write("sum of all account's balances are: " + sum);
}
//-------------------------------------------------------------------------------------------------------------------
document.write("<br>  <h1><b> Assignment 1 :</b></h1>");
checkConst(); //q1 call
checkscope(); //q2 call
//copyObject();
var n = ["Tom", "harry", "leny"];
arrow.apply(void 0, n); //q4 call
document.write("<br><b> Question 5.a </b> <br> This addition works with default values of 2 and 3...check console to see 5!<br>");
console.log(add()); //q5.a call
userfriends.apply(void 0, __spreadArray(["Rahul"], ["keerthi", "sravan", "beck", "ben"], false)); //q5.b call
var names = ["name1", "name2", "name3"];
document.write("<br><br><b> Question 5.c </b> <br> names using spread..........<br>");
printCapitalNames.apply(void 0, names); //q5.c call
document.write("<br><br><b> Question 6 </b> <br> Using template literals instead of concatenation...!<br> <br>");
raiseTicket(); //q6 call
document.write("<br><br><b> Question 7.a </b> <br> De-structuring done by array matching....!<br>");
arrayMatching(); //q7.a call
document.write("<br><br><b> Question 8 </b> <br> check console to see total amount in accounts....!<br>");
classexample1(); //q8 call
//# sourceMappingURL=A1Q.js.map