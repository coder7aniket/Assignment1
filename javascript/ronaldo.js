let Questions = 5,
    Answers = 4,
    result = {};

let printChecked = () => 
{
    let i, j;
    for(i = 1; i <=Questions; i++){
        result[i] = [];
        let item;
        for(j = 1; j <=Answers; j++){
            item = document.getElementsByName(`${i}_${j}_ans`);
            if(item[0].type == 'checkbox' && item[0].checked == true){
                result[i].push(item[0].value);
            }
        }
    }

    console.log(result);
}