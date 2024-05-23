function java_script_quizzV1() {
    const html = {
        sections: document.getElementsByTagName("section"),
        outputSection: document.getElementById("results"),
        outputElement: document.querySelector("#results > li > h1")
    }

    const rightAnswers = ["onclick", "JSON.stringify()", "A programming API for HTML and XML documents"];
    const answers = [];
    let i = 0;

    document.body.addEventListener("click", e => {
        if (e.target.className === "answer-text") {
            const sectionsArr = Array.from(html.sections);
            sectionsArr[i].style.display = "none";

            if (!rightAnswers.includes(e.target.textContent)) {
                answers.push(e.target.innerHTML);
            }

            if (sectionsArr[i + 1] !== undefined) {
                sectionsArr[i + 1].style.display = "block";
                i += 1;
            } else {
                html.outputSection.style.display = "block";
                html.outputElement.innerHTML = answers.length > 0 ? `You have ${3 - answers.length} right answers` : "You are recognized as top JavaScript fan!";
            }
        }
    });
}

function java_script_quizzV2(){
    const correctAnswers = ['onclick', 'JSON.stringify()', 'A programming API for HTML and XML documents'];
    const sections = document.getElementsByTagName('section');
    let answers = 0;
    let index = 0;

    Array.from(document.getElementsByClassName('answer-text')).forEach((p) => p.addEventListener('click', (event) => {
        if (correctAnswers.includes(event.target.textContent.trim())) {
            answers++;
        }

        sections[index++].style.display = 'none';

        if(sections[index] !== undefined){
            sections[index].style.display = 'block';
        }else{
            const result = document.getElementById('results');
            result.style.display = 'block';

            result.querySelector('h1').textContent = answers !== 3 ? `You have ${answers} right answers` : 'You are recognized as top JavaScript fan!';
        }
    }));
}

function java_script_quizzV3(){
    const html = {
        sections: document.getElementsByTagName('section'),
        answers: Array.from(document.getElementsByClassName('answer-text')),
        result: document.getElementById('results')
    }

    const correctAnswers = ['onclick', 'JSON.stringify()', 'A programming API for HTML and XML documents'];
    let answers = 0;
    let index = 0;

    html.answers.forEach(e => e.addEventListener('click', (e) => {
        if(correctAnswers.includes(e.target.textContent.trim())){
            answers++;
        }

        html.sections[index++].style.display = 'none';

        if(html.sections[index] !== undefined){
            html.sections[index].style.display = 'block';
        }else{
            html.result.style.display = 'block';
            html.result.querySelector('h1').textContent = answers !== 3 ? `You have ${answers} right answers` : 'You are recognized as top JavaScript fan!';
        }
    }));
}