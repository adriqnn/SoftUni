function stars(num){
    for(let i = 0;i<num;i++){
        let starsLine = '';
        for(let j = 0;j<num;j++){
            starsLine += '* ';
            
        }
        console.log(starsLine);
    }
}