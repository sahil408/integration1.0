function reverseStr(str){
    let n = str.length;
    let ch = str.split("");
    let temp;

    for (let i=0,j=n-1;i<j;i++,j--){
        temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
    console.log(ch.join(""));
}
let str = "sahil";
reverseStr(str);