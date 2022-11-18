
  
    class Score{
        constructor(e1,e2,e3,e4){
            this.eval_1=e1
            this.eval_2=e2
            this.eval_3=e3
            this.eval_4=e4

        }
    }

    let CalculateScrore=()=>{
        let form=document.getElementById("form")

        let eval1=form.eval_1.value
        let eval2=form.eval_2.value
        let eval3=form.eval_3.value
        let eval4=form.eval_4.value

        let total_score= new Score (eval1,eval2,eval3,eval4)

        if(total_score.eval_1>10||total_score.eval_2>10||total_score.eval_3>10||total_score.eval_4>10){
            alert("Please Enter Correct Score")
        }else{
            let LastScore=(total_score.eval_1*10+total_score.eval_2*15+total_score.eval_3*25+total_score.eval_4*50)
            let score=LastScore/100
            let avg_score=document.getElementById("avg_score").innerText=`Your Average score is ${score}`
        }
        document.querySelector("#eval_1").value=""
        document.querySelector("#eval_2").value=""
        document.querySelector("#eval_3").value=""
        document.querySelector("#eval_4").value=""
        document.querySelector(".correction").style.display="block"
        document.querySelector("#github").style.display="block"


    }
     document.getElementById('eval_4').addEventListener("keydown",function(e){
        if(e.keyCode==13){
            CalculateScrore()

        }
     }) 
   




    let moveNext = document.getElementsByClassName('next')
Array.from(moveNext).forEach((el)=>{
  el.addEventListener("keyup",(event)=> {
    // Number 13 is the "Enter" key on the keyboard
    if (event.keyCode === 13 || el.value.length == 2) {
      // Focus on the next sibling
      el.nextElementSibling.focus()
    }
  })
})

// let note=document.querySelector("note")

let id;
function confirm(){
 
   id= setTimeout(()=>{
    document.querySelector(".note").style.color = "teal";
    },0)
    id=  setTimeout(()=>{
        document.querySelector(".note").style.color = "green";
        // document.getElementById("form").style.borderLeft="3px solid teal"
    },500)
    id=   setTimeout(()=>{
        document.querySelector(".note").style.color = "black";
        // document.getElementById("form").style.borderTop="3px solid red"
    },1000)
    id=   setTimeout(()=>{
        document.querySelector(".note").style.color = "#faa619";
        // document.getElementById("form").style.border="3px solid blue"
    },1500)
    id=   setTimeout(()=>{
        document.querySelector(".note").style.color = "red";
        // document.getElementById("form").style.border="3px solid blue"
        confirm()
    },2000)
}
confirm()


let GoToGithub=()=>{
    window.location.href="https://github.com/thecodervaibhav/Team-Digi-Dreamers/blob/main/Masai%20Calculator/index.html"
}

document.getElementById("github").addEventListener("click",GoToGithub)
 

