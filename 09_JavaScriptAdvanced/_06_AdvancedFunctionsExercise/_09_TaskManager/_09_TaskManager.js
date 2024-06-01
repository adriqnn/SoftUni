function task_managerV1(){
    const input = {
        name: document.getElementById('task'),
        description: document.getElementById('description'),
        date: document.getElementById('date')
    };
    const [_, openSection, progressSection,finishedSection] = Array.from(document.querySelectorAll('section')).map(e => e.children[1]);
    document.getElementById('add').addEventListener('click', addTask);

    function addTask(event){
        event.preventDefault();

        const article = document.createElement('article');
        article.appendChild(createElement('h3', input.name.value));
        article.appendChild(createElement('p', `Description: ${input.description.value}`));
        article.appendChild(createElement('p', `Due Date: ${input.date.value}`));
        const div = createElement('div', '', 'flex');

        const startButton= createElement('button', 'Start', 'green');
        const deleteButton= createElement('button', 'Delete', 'red');
        const finishButton= createElement('button', 'Finish', 'orange');

        div.appendChild(startButton);
        div.appendChild(deleteButton);

        article.appendChild(div);

        openSection.appendChild(article);
        Object.values(input).forEach(i => i.value = '');

        startButton.addEventListener('click', onStart);
        deleteButton.addEventListener('click', onDelete);
        finishButton.addEventListener('click', onFinish);

        function onDelete(){
            article.remove();
        }

        function onStart(){
            startButton.remove();
            div.appendChild(finishButton);
            progressSection.appendChild(article);
        }

        function onFinish(){
            div.remove();
            finishedSection.appendChild(article);
        }
    }

    function createElement(type, content, className){
        const element= document.createElement(type);
        element.textContent = content;

        if(className){
            element.className = className;
        }

        return element;
    }
}

function task_managerV2() {
    const getSection = n => document.querySelector(`body > main > div > section:nth-child(${n}) > div:nth-child(2)`);
    const html = {
        task: document.getElementById("task"),
        description: document.getElementById("description"),
        date: document.getElementById("date"),
        open: getSection(2),
        inProgress: getSection(3),
        completed: getSection(4)
    }
    const isValidInput = arr => arr.every(x => x !== "");
    const btnComponent = (c, t) => `<button class=${c}>${t}</button>`;
    const btnSectionComp = arrTuples => `<div class="flex">${arrTuples.map(x => btnComponent(x[0], x[1])).join("")}</div>`;

    function firstTemp(h, desc, date, c1, t1, c2, t2) {
        const wrapper = document.createElement("article");
        wrapper.innerHTML = `<h3>${h}</h3><p>Description: ${desc}</p><p>Due Date: ${date}</p>${c1 ? btnSectionComp([[c1, t1], [c2, t2],]) : ""}`;
        
        return wrapper;
    }

    document.addEventListener("click", e => {
        e.preventDefault();
        
        if (e.target.tagName === "BUTTON") {
            const [t, d, date] = [html.task.value, html.description.value, html.date.value];
            const actions = {
                "": add,
                green: e => start(e),
                orange: e => finish(e),
                red: e => remove(e)
            };

            function add() {
                debugger
                
                if (isValidInput([t, d, date])) {
                    const a = firstTemp(t, d, date, "green", "Start", "red", "Delete");
                    html.open.appendChild(a);
                    html.task.value = "";
                    html.description.value = "";
                    html.date.value = "";
                }
            }

            function start(e) {
                debugger;
                let parent = e.parentNode.parentNode;
                const [text, desc, date] = Array.from(parent.children).slice(0, 4).map(x => x.innerHTML);
                const a = firstTemp(text, desc.split(": ").filter(x => x !== "")[1], date.split(": ").filter(x => x !== "")[1], "red", "Delete", "orange", "Finish");
                html.inProgress.appendChild(a);
                parent.outerHTML = "";
            }

            function finish(e) {
                let parent = e.parentNode.parentNode;
                const [text, desc, date] = Array.from(parent.children).slice(0, 4).map(x => x.innerHTML);
                const a = firstTemp(text, desc.split(": ").filter(x => x !== "")[1], date.split(": ").filter(x => x !== "")[1]);
                html.completed.appendChild(a);
                parent.outerHTML = "";
            }

            function remove(e) {
                let parent = e.parentNode.parentNode;

                parent.outerHTML = "";
            }

            actions[e.target.className](e.target);
        }
    });
}
