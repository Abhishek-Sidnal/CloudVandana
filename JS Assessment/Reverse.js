function reverse(word) {

    let rw = "";

    for (let i = word.length - 1; i >= 0; i--) {
        rw += word[i];
    }
    return rw;

}

function resSentence(sentence) {

    let words = sentence.split(" ");
    let newStr = [];

    for (let i = 0; i < words.length; i++) {
        let nword = reverse(words[i]);
        newStr.push(nword)
    }

    return newStr.join(" ");
}

const result = resSentence("This is a sunny day");
console.log(result);

