var yearsPrinted = 0;
var currentYear = 2021; //maybe these variables should be declared inside the function

function leapYears() {
    while (yearsPrinted < 20) { 
        if ((currentYear % 4 === 0) && (!((currentYear % 100===0) && (currentYear % 400 !== 0)))) {
            document.write(currentYear + "<br>");
            yearsPrinted++;
            currentYear++;
        } else {
            currentYear++;
        }
    }       
}

leapYears();