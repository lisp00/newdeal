
/*btn_trans*/
$(document).ready(function(){
	$(".btn_trans").click(function(){
		$(".Dash_body").toggleClass("trans");
		$(".dash_aside").toggleClass("trans");
		$(".header_in .logo").toggleClass("trans");
		$(".left_name").toggleClass("trans");
		$(".left_menu").toggleClass("trans");
		$(".top_line").toggleClass("trans");
		$(".map_content").toggleClass("trans");
	})
});


/*Calendar*/
$(document).ready(function(){
	$(function () {
		$("#datepicker01").datepicker({ 
			autoclose: true, 
			todayHighlight: true,
			format:"yyyy-mm-dd",
		}).datepicker('update', new Date());
		$("#datepicker02").datepicker({ 
			autoclose: true, 
			todayHighlight: true,
			format:"yyyy-mm-dd",
		}).datepicker('update', new Date());
		$("#datepicker03").datepicker({ 
			autoclose: true, 
			todayHighlight: true,
			format:"yyyy-mm-dd",
		}).datepicker('update', new Date());
		$("#datepicker04").datepicker({ 
			autoclose: true, 
			todayHighlight: true,
			format:"yyyy-mm-dd",
		}).datepicker('update', new Date());
	});
});


/*left_menu*/
$( document ).ready(function() {
	$('.selb_link').click(function(){
		if(!$(this).hasClass('contact'))
			$(this).removeClass('contact');
			$(this).toggleClass('contact');
			$(this).next(".add_menu").slideToggle().siblings(".add_menu:visible").slideToggle();
	});
		
});


/*btn_contact*/
$(document).ready(function(){
	$(".btn_contact").click(function(){
		$(this).toggleClass("did");
	})
});



/*member_bar*/
$(document).ready(function(){
	$(".member_bar").click(function(){
		$(this).parents(".member_space").toggleClass("on");
	})

	$(".trans_space").click(function(){
		$(this).parents(".member_space").removeClass("on");
	})

	$(".tp_close").click(function(){
		$(this).parents(".member_space").removeClass("on");
	})
})