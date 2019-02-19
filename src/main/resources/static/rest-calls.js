function getWords() {
    var word = $("input#string").val();

    $.ajax({
        method: "GET",
        url: "http://localhost:8080/string/words?string=" + word
    }).done(function (msg) {
        $("#result").text(msg);
    });
}

function getSymbols() {
    var word = $("input#string").val();

    $.ajax({
        method: "GET",
        url: "http://localhost:8080/string/symbols?string=" + word
    }).done(function (msg) {
        $("#result").text(msg);
    });
}

function invert() {
    var word = $("input#string").val();

    $.ajax({
        method: "GET",
        url: "http://localhost:8080/string/invert?string=" + word
    }).done(function (msg) {
        $("#result").text(msg);
    });
}

function getSubstringIndex() {
    var word = $("input#string").val();
    var substring = $("input#substring").val();
    var restUrl = "http://localhost:8080/string/substring?string=" + word + "&substring=" + substring;

    $.ajax({
        method: "GET",
        url: restUrl
    }).done(function (msg) {
        $("#result").text(msg);
    });
}