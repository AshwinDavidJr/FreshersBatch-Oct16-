//------------------------------------------Assignment 1------------------------------------------------------------ 



function checkConst(){                                  //question1
    const a = "i am contstant";
    document.write(" <h3><b>Questiion1 :</b></h3> <br> This is the value of a constant variable and cannot be changed:")
    document.write(a); 

    //a = 3;                                                    //Cant be changed as a is constant
    
}
function checkscope(){                                  //question2
   
    var a=2;
    document.write(" <br> <h3> <b> Questiion 2 :</b></h3>")
    if (a>0){
        let b = "i have a scope of my if condition";
        document.write(b+"<br>");
    }

    //document.write(b);     //throws error as b is local variable
                                                
}

var arrow = (...names: string[])=>{                                           //question4

    document.write(" <br> <h3> <b> Questiion 4 : check console...!!</b></h3>")
    let output = [];

    for(let i in names){
        output.push({
            name:names[i],
            length:names[i].length
        });
    }
    
    console.log(...output);
    for(let i in output){

        document.write(output[i].name+"-"+output[i].length+"<br>");
    }
    
}
var add=(a=2,b=3)=>a+b;                                 //question 5.a


var userfriends=(username: string,...friends: string[])=>{                //question 5.b
    document.write("<br><b>Question 5.b</b> <br><br>user : "+username+"<br> Friends: <br>");
    for(let i in friends)
    
    {
        document.write(friends[i]);
    }
    }    
    
    
var printCapitalNames=(...names: string[])=>{                         //question 5.c
for(let i in names)
document.write(names[i].toUpperCase()+"<br>");
}

var raiseTicket =()=>{                          //question 6

    let lapModel = "Ideapad 320";
    let deskNo = 39;
    let uName = "Dikshit";

    document.write(`Hi,
    This is raise a ticket on a issue with my laptop with model name ${lapModel}. 
    It has been acting wierd and shutting down frequently.The issue also seem to only happen while connected to my desk.
    My desk no is ${deskNo} and the plug points are working fine too.
    hope you look to it as soon as possible.
    
    ${uName}
    `)
}

var arrayMatching = ()=>{                               //question 7.a
    let arr = ["elm1","elm2","elm3","elm4"];
    let [e1,e2,e3,e4] = arr;
    document.write("3rd element is : "+e3);
}


function classexample1(){

    class Account{
        id: any;
        name: any;
        balance: any;
        constructor(id: any,name: any,balance: any){
            this.id = id;
            this.balance = balance;
            this.name=name;
        }
    }

    class SavingAccount extends Account {
        private intrest=.02;
            constructor(id: any,name:any,balance:any) {
                super(id,name,balance);
                this.balance = this.balance+(this.balance*this.intrest);
            }
        }
    class CurrentAccount extends Account {
        cash_credit = 1000;
        constructor(id: any,name:any,balance:any) {
            super(id, name, balance);
            this.balance+=this.cash_credit;
      }
    }

    let acc1 = new SavingAccount(1001,"Holder1",10000);
    let acc2 = new CurrentAccount(1002,"Holder2",15000);

    let sum = 0;
    sum=acc1.balance+acc2.balance;
    console.log(sum);
    document.write(`sum of all account's balances are: ${sum}`);

    }



//-------------------------------------------------------------------------------------------------------------------

document.write("<br>  <h1><b> Assignment 1 :</b></h1>")



checkConst();               //q1 call
checkscope();               //q2 call
//copyObject();
let n=["Tom","harry","leny"];
arrow(...n);                //q4 call

document.write("<br><b> Question 5.a </b> <br> This addition works with default values of 2 and 3...check console to see 5!<br>");

console.log(add());        //q5.a call

userfriends("Rahul",...["keerthi","sravan","beck","ben"]);     //q5.b call

let names=["name1","name2","name3"];
document.write("<br><br><b> Question 5.c </b> <br> names using spread..........<br>");
printCapitalNames(...names);                                   //q5.c call



document.write("<br><br><b> Question 6 </b> <br> Using template literals instead of concatenation...!<br> <br>");
raiseTicket();                                                            //q6 call



document.write("<br><br><b> Question 7.a </b> <br> De-structuring done by array matching....!<br>");
arrayMatching();                                                //q7.a call


document.write("<br><br><b> Question 8 </b> <br> check console to see total amount in accounts....!<br>");
classexample1();                                                        //q8 call