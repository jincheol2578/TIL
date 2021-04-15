// 생성자 함수는 클래스랑 같은역할임
// 관습적으로 생성자 함수는 대문자로 시작!
// Constructor function https://developer.mozilla.org/ko/docs/Learn/JavaScript/Objects/Object-oriented_JS
// Object prototypes : https://developer.mozilla.org/ko/docs/Learn/JavaScript/Objects/Object_prototypes
// Inheritance in JavaScript : https://developer.mozilla.org/ko/docs/Learn/JavaScript/Objects/Inheritance

function Person(first, last, age, gender, interests) {
    this.name = {
        first: first + " ",
        last: last + " is ",
    };
    this.age = age + "years old. ";
    this.gender = gender;
    this.interests = interests;
    var string = "";
    var genTxt;
    this.bio = function () {
        if (gender === "male") {
            genTxt = "He like ";
        } else {
            genTxt = "She like ";
        }

        for (var i = 0; i < this.interests.length; i++) {
            if (i !== this.interests.length - 1) {
                string += interests[i] + " and ";
            } else {
                string += interests[i] + ". ";
            }
        }

        console.log(this.name.first + this.name.last + this.age + genTxt + string);
    };
}

function Teacher(first, last, age, gender, interests, subject) {
    Person.call(this, first, last, age, gender, interests); // Person 생성자 함수를 상속받는다

    this.subject = subject;
    this.greeting = function () {
        console.log("hello my subject is " + subject);
    };
}

var person1 = new Person("Bob", "Smith", 32, "male", ["music", "skiing"]);

person1.bio();
console.log(person1.valueOf());
console.log(Person.prototype);
console.log(Object.prototype);

var teacher1 = new Teacher("kim", "jincheol", 25, "male", ["trade", "music", "travel"], "programing");
teacher1.bio();
teacher1.greeting();
