function showLoader() {
    $("#load").show();
}

function hideLoader() {
    $("#load").hide();
}

function test() {
    showLoader();
    window.setTimeout(13000);
    $.ajax({
        type: "post",
        contentype: "application/json",
        url: "/employeesubmit",

        success: function (data) {

            $("#loadEmpData").html(data);
            console.log("Response came from server", data);
            hideLoader();
        },
        error: function (err) {
            console.log("Something went wrong!");
        },
        complete: function () {
            hideLoader();

        }
    });
}