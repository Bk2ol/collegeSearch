$(function() {
  var msMajor = $('#ms-major').magicSuggest({
    placeholder: 'Select...',
    allowFreeEntries: false,
    expandOnFocus: true,
    selectionPosition: 'inner',
    resultAsString: true,
    groupBy: 'catagory',
    valueField: 'name',
    data: [{
          "id": 1,
          "name": "Math",
          "catagory": "Science"
      },{
          "id": 2,
          "name": "Computer Science",
          "catagory": "Science"
      },{
          "id": 3,
          "name": "Biological Sciences",
          "catagory": "Science"
      },{
          "id": 4,
          "name": "Physics",
          "catagory": "Science"
      },{
          "id": 5,
          "name": "Statistics",
          "catagory": "Science"
      },{
          "id": 6,
          "name": "Chemistry",
          "catagory": "Science"
      },{
          "id": 7,
          "name": "Economics",
          "catagory": "Social Science"
      },{
          "id": 8,
          "name": "English",
          "catagory": "Social Science"
      },{
          "id": 9,
          "name": "Education",
          "catagory": "Education"
      },{
          "id": 10,
          "name": "Business",
          "catagory": "Business"
    }]
  });
  $('#ms-degree').magicSuggest({
    placeholder: 'Select...',
    allowFreeEntries: false,
    expandOnFocus: true,
    selectionPosition: 'inner',
    resultAsString: true,
    valueField: 'name',
      data: [{
            "id": 1,
            "name": "Master",
        },{
            "id": 2,
            "name": "PHD"
      }]
  }); 
  var msLanguageTest = $('#ms-LanguageTest').magicSuggest({
    placeholder: 'Select...',
    allowFreeEntries: false,
    expandOnFocus: true,
    selectionPosition: 'inner',
    resultAsString: true,
    maxSelection: 1,
    valueField: 'name',
      data: [{
            "id": 1,
            "name": "TOEFL",
        },{
            "id": 2,
            "name": "IELTS"
      }]
  }); 
  
  

  var msTest = $('#ms-Test').magicSuggest({
    placeholder: 'Select...',
    allowFreeEntries: false,
    expandOnFocus: true,
    selectionPosition: 'inner',
    resultAsString: true,
    maxSelection: 1,
    valueField: 'name',
      data: [{
            "id": 1,
            "name": "GRE",
        },{
            "id": 2,
            "name": "GMAT"
        },{
            "id": 3,
            "name": "LAST"
      }]
  }); 
  
  var msDeadline=$('#ms-Deadline').magicSuggest({
    placeholder: 'Select...',
    allowFreeEntries: false,
    expandOnFocus: true,
    selectionPosition: 'inner',
    resultAsString: true,
    maxSelection: 1,
    valueField: 'name',
      data: [{
            "id": 1,
            "name": "Spring",
        },{
            "id": 2,
            "name": "Fall"
      }]
  }); 

  $(msLanguageTest).on('focus', function(event){  // make three single choice
													// more like a selection box
    msLanguageTest.clear();
  });

  $(msTest).on('focus', function(event){
    msTest.clear();
  });

  $(msDeadline).on('focus', function(event){
    msDeadline.clear();
  });

  $(msMajor).on('blur',function(event){         // when select too much element
												// in major, to line up deadline

	 var distance= $('#checkHightForLineUp1').offset().left - $('#checkHightForLineUp').offset().left;


    if(distance != 15 ){  // 15 is the normal distance for two div
      $('#dateLineUp1').removeClass('col-md-2').addClass('col-md-6');
      $('#dateLineUp2').removeClass('col-md-2').addClass('col-md-6');
    }else{ 
       $('#dateLineUp1').removeClass('col-md-6').addClass('col-md-2');
       $('#dateLineUp2').removeClass('col-md-6').addClass('col-md-2');
    }
  });
  // $(msLanguageTest).on('blur', function(event){ // TO DO: change text when
	// select different kind of score
  // alert(123);
  // $('#englishTestLabel').text($('#ms-LanguageTest').magicSuggest().getSelection().name+"
	// Score");
  // });

  $('#ms-state').magicSuggest({
    placeholder: 'Select...',
    allowFreeEntries: false,
    expandOnFocus: true,
    selectionPosition: 'inner',
    resultAsString: true,
    maxSelection: 50,
    valueField: 'name',
      data: [{
            "id": 1,
            "name": "Alabama",
            "value":"AL"
        },{
            "id": 2,
            "name": "Alaska",
            "value":"AK"
        },{
            "id": 3,
            "name": "Arizona",
            "value":"AZ"
        },{
            "id": 4,
            "name": "Arkansas",
            "value":"AR"
        },{
            "id": 5,
            "name": "California",
            "value":"CA"
        },{
            "id": 6,
            "name": "Colorado",
            "value":"CO"
        },{
            "id": 7,
            "name": "Connecticut",
            "value":"CT"
        },{
            "id": 8,
            "name": "Delaware",
            "value":"DE"
        },{
            "id": 9,
            "name": "Florida",
            "value":"FL"
        },{
            "id": 10,
            "name": "Georgia",
            "value":"GA"
        },{
            "id": 11,
            "name": "Hawaii",
            "value":"HI"
        },{
            "id": 12,
            "name": "Idaho",
            "value":"ID"
        },{
            "id": 13,
            "name": "Illinois",
            "value":"IL"
        },{
            "id": 14,
            "name": "Indiana",
            "value":"IN"
        },{
            "id": 15,
            "name": "Iowa",
            "value":"IA"
        },{
            "id": 16,
            "name": "Kansas",
            "value":"KS"
        },{
            "id": 17,
            "name": "Kentucky",
            "value":"KY"
        },{
            "id": 18,
            "name": "Louisiana",
            "value":"LA"
        },{
            "id": 19,
            "name": "Maine",
            "value":"ME"
        },{
            "id": 20,
            "name": "Maryland",
            "value":"MD"
        },{
            "id": 21,
            "name": "Massachusetts",
            "value":"MA"
        },{
            "id": 22,
            "name": "Michigan",
            "value":"MI"
        },{
            "id": 23,
            "name": "Minnesota",
            "value":"MN"
        },{
            "id": 24,
            "name": "Mississippi",
            "value":"MS"
        },{
            "id": 25,
            "name": "Missouri",
            "value":"MO"
        },{
            "id": 26,
            "name": "Montana",
            "value":"MT"
        },{
            "id": 27,
            "name": "Nebraska",
            "value":"NE"
        },{
            "id": 28,
            "name": "Nevada",
            "value":"NV"
        },{
            "id": 29,
            "name": "New Hampshire",
            "value":"NH"
        },{
            "id": 30,
            "name": "New Jersey",
            "value":"NJ"
        },{
            "id": 31,
            "name": "New Mexico",
            "value":"NM"
        },{
            "id": 32,
            "name": "New York",
            "value":"NY"
        },{
            "id": 33,
            "name": "North Carolina",
            "value":"NC"
        },{
            "id": 34,
            "name": "North Dakota",
            "value":"ND"
        },{
            "id": 35,
            "name": "Ohio",
            "value":"OH"
        },{
            "id": 36,
            "name": "Oklahoma",
            "value":"OK"
        },{
            "id": 37,
            "name": "Oregon",
            "value":"OR"
        },{
            "id": 38,
            "name": "Pennsylvania",
            "value":"PA"
        },{
            "id": 39,
            "name": "Rhode Island",
            "value":"RI"
        },{
            "id": 40,
            "name": "South Carolina",
            "value":"SC"
        },{
            "id": 41,
            "name": "South Dakota",
            "value":"SD"
        },{
            "id": 42,
            "name": "Tennessee",
            "value":"TN"
        },{
            "id": 43,
            "name": "Texas",
            "value":"TX"
        },{
            "id": 44,
            "name": "Utah",
            "value":"UT"
        },{
            "id": 45,
            "name": "Vermont",
            "value":"VT"
        },{
            "id": 46,
            "name": "Virginia",
            "value":"VA"
        },{
            "id": 47,
            "name": "Washington",
            "value":"WA"
        },{
            "id": 48,
            "name": "West Virginia",
            "value":"WV"
        },{
            "id": 49,
            "name": "Wisconsin",
            "value":"WI"
        },{
            "id": 50,
            "name": "Wyoming",
            "value":"WY"
      }]
  });
// $("[data-toggle='tooltip']").tooltip();
});
$('#ms-major').parent().popover({trigger:'hover',placement:'top',content:'Select your major, multiple major can be selected'});
$('#ms-degree').parent().popover({trigger:'hover',placement:'top',content:'Select your degree, you can search both master and PHD degree'});
$('#bottomRank').parent().popover({trigger:'hover',placement:'top',content:'Select the highest rank number you want to search'});
$('#topRank').parent().popover({trigger:'hover',placement:'top',content:'Select the lowest rank number you want to search'});
$('#ms-LanguageTest').parent().popover({trigger:'hover',placement:'top',content:'Select the type of langage test and enter the score'});
$('#ms-Test').parent().popover({trigger:'hover',placement:'top',content:'Select the type of general test and enter the score'});
$('#ms-Deadline').parent().popover({trigger:'hover',placement:'top',content:'Select the semester you want to eroll'});
$('#dateLineUp2').popover({trigger:'hover',placement:'top',content:'Select the date and this will search the date equal or before the selected date'});
$('#ms-state').parent().popover({trigger:'hover',placement:'top',content:'Select the school location, multiple major can be selected'});
$("div.dataTables_filter").popover({trigger:'hover',placement:'top',content:'Select the school location, multiple major can be selected'});
//datatable initialize
$("div.dataTables_filter").keyup( function (e) {
  
    if (e.keyCode == 13) {
        oTable.fnFilter( this.value );
    }
} );
$('#graduateSchoolTable').DataTable({
  "scrollX": true,
  "columns": [
                { "data": "schoolName" },
                { "data": "majorName" },
                { "data": "degree" },
                { "data": "rank" },
                { "data": "test" },
                { "data": "languageTest" },
                { "data": "deadline" },
                { "data": "phone" },
                { "data": "email" },
                { "data": "admissionWebpage",
                  "render" : function(data, type, row, meta){
                    return '<button class = "btn btn-primary" data-toggle="tooltip" data-placement="top" >Click here to copy</button>'
                   }
                }
             ],
  "language": {
    "emptyTable":     "Please Search By The Option Above"
  }
});


// copy the url of school
$('#graduateSchoolTable tbody').on( 'click', 'button', function () {
  var table = $('#graduateSchoolTable').DataTable();
    var data =  table.row( $(this).parents('tr') ).data();
    copyTextToClipboard(data.admissionWebpage);
} );

$('#datetimepicker').datetimepicker();
    $('.form_date').datetimepicker({
      weekStart: 1,
      todayBtn:  1,
      autoclose: 1,
      todayHighlight: 1,
      startView: 2,
      minView: 2,
      pickerReferer: "input",
      forceParse: 0
    });
    

$('#getCriteria').on('click', function(event){
  var query = new Object();
  var majorList = $('#ms-major').magicSuggest().getSelection(); // get the query
																// parameter
  if(majorList.length != 0){
    let tmpArr = [];
    for(let i = 0 ; i < majorList.length ; i++){
      tmpArr.push(majorList[i].name);
    }
    query["major"]=tmpArr;
  }
  var Degree = $('#ms-degree').magicSuggest().getSelection();
	if(Degree.length == 1){
		if(Degree[0].name == "Master"){
			query["degree"]="MS";
		}else{
			query["degree"]="PHD";
		}	
	}
  var stateList = $('#ms-state').magicSuggest().getSelection();
  if(stateList.length != 0){
    let tmpArr = [];
    for(let i = 0 ; i < stateList.length ; i++){
      tmpArr.push(stateList[i].value);
    }
    query["state"]=tmpArr;
  }

  var test = $('#ms-Test').magicSuggest().getSelection();
  if(test.length != 0){
    if(!isNaN($('#TestScore').val())){
      query[test[0].name.toLowerCase()]=$('#TestScore').val().toString();
    }else{
      alert("Please enter a vaild "+test[0].name+" score!");
    }
  }

  var LanguageTest = $('#ms-LanguageTest').magicSuggest().getSelection();
  if(LanguageTest.length != 0){
    if(!isNaN($('#LanguageScore').val())){
      query[LanguageTest[0].name.toLowerCase()]=$('#LanguageScore').val().toString();
    }else{
      alert("Please enter a vaild "+LanguageTest[0].name+" score!");
    }
  }

  if($('#topRank').val() != ""){
    if(!isNaN($('#topRank').val()))
    query['topRank']=$('#topRank').val();
  }
  if($('#bottomRank').val() != ""){
    if(!isNaN($('#bottomRank').val()))
    query['bottomRank']=$('#bottomRank').val();
  }

  var deadline=$('#ms-Deadline').magicSuggest().getSelection();
  if(deadline.length != 0 && $("#dtp_input2").val() != ""){
    var date=parseInt($("#dtp_input2").val().substr(5,2)+$("#dtp_input2").val().substr(8,2));
    if(deadline[0].name == "Spring"){
      query["springApplicationDeadline"]=date;
    }else{
      query["fallApplicationDeadline"]=date;
    }
  }

    $.ajax({
      type: "POST",
      url: "graduateSchool/searchGraduateSchoolMajor",
      data: JSON.stringify(query),
      contentType :   'application/json',
      dataType: "json",
         success: function(result){
        	 var table=$('#graduateSchoolTable').DataTable();
        	 table.clear().draw();
        	 table.rows.add(result).draw();
           $.notify(
            {
              icon: 'glyphicon glyphicon-ok-circle',
              message: "Search success!"
            },{
              type: 'success',
              delay: 2000,
              template: '<div data-notify="container" class="col-xs-5 col-sm-3 col-xl-2 alert alert-{0}" role="alert">' +
                        '<button type="button" aria-hidden="true" class="close" data-notify="dismiss">×</button>' +
                        '<span data-notify="icon"></span> ' +
                        '<span data-notify="title">{1}</span> ' +
                        '<span data-notify="message">{2}</span>' +
                        '<div class="progress" data-notify="progressbar">' +
                          '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
                        '</div>' +
                        '<a href="{3}" target="{4}" data-notify="url"></a>' +
                      '</div>' 
          });
         }
    });
});
$('#TestScore,#LanguageScore,#topRank,#bottomRank').on( "keyup",function(e){  // to
																				// vaild
																				// the
																				// number
																				// input
  if(isNaN($(this).val()))
    $(this).val("");
});

function copyTextToClipboard(text) {
  var textArea = document.createElement("textarea");

  //
  // *** This styling is an extra step which is likely not required. ***
  //
  // Why is it here? To ensure:
  // 1. the element is able to have focus and selection.
  // 2. if element was to flash render it has minimal visual impact.
  // 3. less flakyness with selection and copying which **might** occur if
  //    the textarea element is not visible.
  //
  // The likelihood is the element won't even render, not even a flash,
  // so some of these are just precautions. However in IE the element
  // is visible whilst the popup box asking the user for permission for
  // the web page to copy to the clipboard.
  //

  // Place in top-left corner of screen regardless of scroll position.
  textArea.style.position = 'fixed';
  textArea.style.top = 0;
  textArea.style.left = 0;

  // Ensure it has a small width and height. Setting to 1px / 1em
  // doesn't work as this gives a negative w/h on some browsers.
  textArea.style.width = '2em';
  textArea.style.height = '2em';

  // We don't need padding, reducing the size if it does flash render.
  textArea.style.padding = 0;

  // Clean up any borders.
  textArea.style.border = 'none';
  textArea.style.outline = 'none';
  textArea.style.boxShadow = 'none';

  // Avoid flash of white box if rendered for any reason.
  textArea.style.background = 'transparent';


  textArea.value = text;

  document.body.appendChild(textArea);

  textArea.select();

  try {
    var successful = document.execCommand('copy');
    var msg = successful ? 'successful' : 'unsuccessful';
    $.notify(
            {
              icon: 'glyphicon glyphicon-ok',
              message: "Copy the Link: "+text,
              // url: 'goHTTP/'+text
            },{
              type: 'success',
              delay: 2000,
              template: '<div data-notify="container" class="col-xs-5 col-sm-3 col-xl-2 alert alert-{0}" role="alert">' +
                        '<button type="button" aria-hidden="true" class="close" data-notify="dismiss">×</button>' +
                        '<span data-notify="icon"></span> ' +
                        '<span data-notify="title">{1}</span> ' +
                        '<span data-notify="message">{2}</span>' +
                        '<div class="progress" data-notify="progressbar">' +
                          '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
                        '</div>' +
                        '<a href="{3}" target="{4}" data-notify="url"></a>' +
                      '</div>' 
          });
  } catch (err) {
    console.log('Oops, unable to copy');
  }

  document.body.removeChild(textArea);
}