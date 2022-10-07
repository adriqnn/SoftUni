function solve(){
    let text = document.getElementById('text').value;
    let namingConvention = document.getElementById('naming-convention').value;
    let result = '';
    let words = text.split(/(\s+)/).filter(x => x !=  ' ');

    if(namingConvention == 'Pascal Case'){
        for (let i = 0; i < words.length; i++) {
            words[i] = words[i].charAt(0).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        result = words.join('');

    }else if(namingConvention == 'Camel Case'){
        for (let i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            if(i > 0){
                words[i] = words[i].charAt(0).toUpperCase() + words[i].substring(1);
            }
        }
        result = words.join('');
    }else {
        result = 'Error!'
    }
    document.getElementById('result').textContent = result;
}