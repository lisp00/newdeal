$(document).ready(function() {
    let editPlan = function getEditPlan() {
        // overview 요청
        $.ajax({
            url:"/editPlanAjax",
            type:"GET",
            dataType:'json',
            success:function(res) {
                console.log(res);
            },
            error:function() {
                alert("ajax error - editPlan");
            }
        });
    }

    // editPlan();
});
