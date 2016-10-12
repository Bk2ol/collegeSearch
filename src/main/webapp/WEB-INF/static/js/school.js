$(function() {
	var msLanguageTest = $('#ms-LanguageTest').magicSuggest({
		placeholder : 'Select...',
		allowFreeEntries : false,
		expandOnFocus : true,
		selectionPosition : 'inner',
		resultAsString : true,
		maxSelection : 1,
		valueField : 'name',
		data : [ {
			"id" : 1,
			"name" : "TOEFL",
		}, {
			"id" : 2,
			"name" : "IELTS"
		} ]
	});
	var msTest = $('#ms-Test').magicSuggest({
		placeholder : 'Select...',
		allowFreeEntries : false,
		expandOnFocus : true,
		selectionPosition : 'inner',
		resultAsString : true,
		maxSelection : 1,
		valueField : 'name',
		data : [ {
			"id" : 1,
			"name" : "SAT I",
		}, {
			"id" : 2,
			"name" : "ACT"

		} ]
	});
	var msSatII = $('#ms-SatII').magicSuggest({
		placeholder : 'Select...',
		allowFreeEntries : false,
		expandOnFocus : true,
		selectionPosition : 'inner',
		resultAsString : true,
		groupBy : 'catagory',
		valueField : 'name',
		data : [ {
			"id" : 1,
			"name" : "Math",
			"catagory" : "Math and Science"
		}, {
			"id" : 2,
			"name" : "Computer Science",
			"catagory" : "Math and Science"
		}, {
			"id" : 3,
			"name" : "Biological Sciences",
			"catagory" : "Math and Science"
		}, {
			"id" : 4,
			"name" : "Physics",
			"catagory" : "Math and Science"
		}, {
			"id" : 5,
			"name" : "Statistics",
			"catagory" : "Math and Science"
		}, {
			"id" : 6,
			"name" : "Chemistry",
			"catagory" : "Humanities"
		}, {
			"id" : 7,
			"name" : "Economics",
			"catagory" : "Humanities"
		}, {
			"id" : 8,
			"name" : "English",
			"catagory" : "Humanities"
		}, {
			"id" : 9,
			"name" : "French",
			"catagory" : "Languages"
		}, {
			"id" : 10,
			"name" : "German",
			"catagory" : "Languages"
		}, {
			"id" : 11,
			"name" : "Spanish",
			"catagory" : "Languages"
		}, {
			"id" : 12,
			"name" : "Modern Hebrew",
			"catagory" : "Languages"
		}, {
			"id" : 13,
			"name" : "Italian",
			"catagory" : "Languages"
		}, {
			"id" : 14,
			"name" : "Latin",
			"catagory" : "Languages"

		} ]
	});
	var msCost = $('#ms-Cost').magicSuggest({
		placeholder : 'Select...',
		allowFreeEntries : false,
		expandOnFocus : true,
		selectionPosition : 'inner',
		resultAsString : true,
		maxSelection : 1,
		valueField : 'name',
		data : [ {
			"id" : 1,
			"name" : "0~$15000",
		}, {
			"id" : 2,
			"name" : "0~$20000",
		}, {
			"id" : 3,
			"name" : "0~$25000",
		}, {
			"id" : 4,
			"name" : "0~$30000",
		}, {
			"id" : 5,
			"name" : "0~$35000",
		}, {
			"id" : 6,
			"name" : "0~$40000",
		}, {
			"id" : 7,
			"name" : "0~$45000",
		}, {
			"id" : 8,
			"name" : "0~$50000",
		}, {
			"id" : 9,
			"name" : "0~$50000",
		}, {
			"id" : 10,
			"name" : "0~$60000",
		}, {
			"id" : 11,
			"name" : "0~$65000",
		} ]
	});
	var msAcceptRate = $('#ms-AcceptRate').magicSuggest({
		placeholder : 'Select...',
		allowFreeEntries : false,
		expandOnFocus : true,
		selectionPosition : 'inner',
		resultAsString : true,
		valueField : 'name',
		data : [ {
			"id" : 1,
			"name" : "0~25%",
			"value" : "25"
		}, {
			"id" : 2,
			"name" : "25%~50%",
			"value" : "50"
		}, {
			"id" : 3,
			"name" : "51%~75%",
			"value" : "75"
		}, {
			"id" : 4,
			"name" : "75%~100%",
			"value" : "100"
		} ]
	});
	var msType = $('#ms-Type').magicSuggest({
		placeholder : 'Select...',
		allowFreeEntries : false,
		expandOnFocus : true,
		selectionPosition : 'inner',
		resultAsString : true,
		valueField : 'name',
		data : [ {
			"id" : 1,
			"name" : "Public",
		}, {
			"id" : 2,
			"name" : "Private",
		}, {
			"id" : 3,
			"name" : "Private_Men",
		}, {
			"id" : 4,
			"name" : "Private_Women",
		}, {
			"id" : 5,
			"name" : "Proprietary",
		} ]
	});
	var msSetting = $('#ms-Setting').magicSuggest({
		placeholder : 'Select...',
		allowFreeEntries : false,
		expandOnFocus : true,
		selectionPosition : 'inner',
		resultAsString : true,
		valueField : 'name',
		data : [ {
			"id" : 1,
			"name" : "Urban",
		}, {
			"id" : 2,
			"name" : "Suburban",
		}, {
			"id" : 3,
			"name" : "Rural",
		}, {
			"id" : 4,
			"name" : "City",
		} ]
	});
	var msSize = $('#ms-Size').magicSuggest({
		placeholder : 'Select...',
		allowFreeEntries : false,
		expandOnFocus : true,
		selectionPosition : 'inner',
		resultAsString : true,
		valueField : 'name',
		data : [ {
			"id" : 1,
			"name" : "Small",
		}, {
			"id" : 2,
			"name" : "Medium",
		}, {
			"id" : 3,
			"name" : "Large",
		} ]
	});
	var msCategory = $('#ms-Category').magicSuggest({
		placeholder : 'Select...',
		allowFreeEntries : false,
		expandOnFocus : true,
		selectionPosition : 'inner',
		resultAsString : true,
		valueField : 'name',
		data : [ {
			"id" : 1,
			"name" : "National University",
			"value" : "NU"
		}, {
			"id" : 2,
			"name" : "Art Schools",
			"value" : "Art Schools"
		}, {
			"id" : 3,
			"name" : "Business Schools",
			"value" : "Business Schools"
		}, {
			"id" : 4,
			"name" : "Engineering Schools",
			"value" : "Engineering Schools"
		} ]
	});
	// make three single choice more like a selection box
	$(msLanguageTest).on('focus', function(event) {
		msLanguageTest.clear();
	});

	$(msTest).on('focus', function(event) {
		msTest.clear();
	});

	$(msCost).on('focus', function(event) {
		msCost.clear();
	});

	$('#ms-State').magicSuggest({
		placeholder : 'Select...',
		allowFreeEntries : false,
		expandOnFocus : true,
		selectionPosition : 'inner',
		resultAsString : true,
		maxSelection : 50,
		valueField : 'name',
		data : [ {
			"id" : 1,
			"name" : "Alabama",
			"value" : "AL"
		}, {
			"id" : 2,
			"name" : "Alaska",
			"value" : "AK"
		}, {
			"id" : 3,
			"name" : "Arizona",
			"value" : "AZ"
		}, {
			"id" : 4,
			"name" : "Arkansas",
			"value" : "AR"
		}, {
			"id" : 5,
			"name" : "California",
			"value" : "CA"
		}, {
			"id" : 6,
			"name" : "Colorado",
			"value" : "CO"
		}, {
			"id" : 7,
			"name" : "Connecticut",
			"value" : "CT"
		}, {
			"id" : 8,
			"name" : "Delaware",
			"value" : "DE"
		}, {
			"id" : 9,
			"name" : "Florida",
			"value" : "FL"
		}, {
			"id" : 10,
			"name" : "Georgia",
			"value" : "GA"
		}, {
			"id" : 11,
			"name" : "Hawaii",
			"value" : "HI"
		}, {
			"id" : 12,
			"name" : "Idaho",
			"value" : "ID"
		}, {
			"id" : 13,
			"name" : "Illinois",
			"value" : "IL"
		}, {
			"id" : 14,
			"name" : "Indiana",
			"value" : "IN"
		}, {
			"id" : 15,
			"name" : "Iowa",
			"value" : "IA"
		}, {
			"id" : 16,
			"name" : "Kansas",
			"value" : "KS"
		}, {
			"id" : 17,
			"name" : "Kentucky",
			"value" : "KY"
		}, {
			"id" : 18,
			"name" : "Louisiana",
			"value" : "LA"
		}, {
			"id" : 19,
			"name" : "Maine",
			"value" : "ME"
		}, {
			"id" : 20,
			"name" : "Maryland",
			"value" : "MD"
		}, {
			"id" : 21,
			"name" : "Massachusetts",
			"value" : "MA"
		}, {
			"id" : 22,
			"name" : "Michigan",
			"value" : "MI"
		}, {
			"id" : 23,
			"name" : "Minnesota",
			"value" : "MN"
		}, {
			"id" : 24,
			"name" : "Mississippi",
			"value" : "MS"
		}, {
			"id" : 25,
			"name" : "Missouri",
			"value" : "MO"
		}, {
			"id" : 26,
			"name" : "Montana",
			"value" : "MT"
		}, {
			"id" : 27,
			"name" : "Nebraska",
			"value" : "NE"
		}, {
			"id" : 28,
			"name" : "Nevada",
			"value" : "NV"
		}, {
			"id" : 29,
			"name" : "New Hampshire",
			"value" : "NH"
		}, {
			"id" : 30,
			"name" : "New Jersey",
			"value" : "NJ"
		}, {
			"id" : 31,
			"name" : "New Mexico",
			"value" : "NM"
		}, {
			"id" : 32,
			"name" : "New York",
			"value" : "NY"
		}, {
			"id" : 33,
			"name" : "North Carolina",
			"value" : "NC"
		}, {
			"id" : 34,
			"name" : "North Dakota",
			"value" : "ND"
		}, {
			"id" : 35,
			"name" : "Ohio",
			"value" : "OH"
		}, {
			"id" : 36,
			"name" : "Oklahoma",
			"value" : "OK"
		}, {
			"id" : 37,
			"name" : "Oregon",
			"value" : "OR"
		}, {
			"id" : 38,
			"name" : "Pennsylvania",
			"value" : "PA"
		}, {
			"id" : 39,
			"name" : "Rhode Island",
			"value" : "RI"
		}, {
			"id" : 40,
			"name" : "South Carolina",
			"value" : "SC"
		}, {
			"id" : 41,
			"name" : "South Dakota",
			"value" : "SD"
		}, {
			"id" : 42,
			"name" : "Tennessee",
			"value" : "TN"
		}, {
			"id" : 43,
			"name" : "Texas",
			"value" : "TX"
		}, {
			"id" : 44,
			"name" : "Utah",
			"value" : "UT"
		}, {
			"id" : 45,
			"name" : "Vermont",
			"value" : "VT"
		}, {
			"id" : 46,
			"name" : "Virginia",
			"value" : "VA"
		}, {
			"id" : 47,
			"name" : "Washington",
			"value" : "WA"
		}, {
			"id" : 48,
			"name" : "West Virginia",
			"value" : "WV"
		}, {
			"id" : 49,
			"name" : "Wisconsin",
			"value" : "WI"
		}, {
			"id" : 50,
			"name" : "Wyoming",
			"value" : "WY"
		} ]
	});
	var standerheight = $('#heightStandard').get(0).getBoundingClientRect().height;
	if ($('#heightForBottomRank').height() != standerheight) {
		$('#heightForBottomRank').css("height", standerheight + 'px');
	}
	if ($('#heightForTopRank').get(0).getBoundingClientRect().height != standerheight) {
		$('#heightForTopRank').css("height", standerheight + 'px');
	}

});

$('#ms-LanguageTest').parent().popover({trigger:'hover',placement:'top',content:'Select the type of langage test and enter the score'});
$('#ms-Test').parent().popover({trigger:'hover',placement:'top',content:'Select the type of test and enter the score of each part respectively'});
$('#ms-SatII').parent().popover({trigger:'hover',placement:'top',content:'Select your SAT subject, multiple subjects can be selected'});
$('#bottomRank').parent().popover({trigger:'hover',placement:'top',content:'Select the highest rank number you want to search'});
$('#topRank').parent().popover({trigger:'hover',placement:'top',content:'Select the lowest rank number you want to search'});
$('#ms-AcceptRate').parent().popover({trigger:'hover',placement:'top',content:'Select the school accept rate interval, multiple intervals can be selected'});
$('#ms-Size').parent().popover({trigger:'hover',placement:'top',content:'Select the school population size, small: below 2000, medium: 2000-5000, large: above 5000'});
$('#ms-State').parent().popover({trigger:'hover',placement:'top',content:'Select the school location, multiple major can be selected'});


// costom column sort function for datatable
jQuery.extend( jQuery.fn.dataTableExt.oSort, {
    "non-empty-string-asc": function (str1, str2) {
        if(str1 == "" || str1 == null)
            return 1;
        if(str2 == "" || str2 == null)
            return -1;
        return ((str1 < str2) ? -1 : ((str1 > str2) ? 1 : 0));
    },
 
    "non-empty-string-desc": function (str1, str2) {
        if(str1 == "" || str1 == null)
            return 1;
        if(str2 == "" || str2 == null)
            return -1;
        return ((str1 < str2) ? 1 : ((str1 > str2) ? -1 : 0));
    }
} );
jQuery.extend( jQuery.fn.dataTableExt.oSort, {
    "non-empty-number-asc": function (num1, num2) {
    if(num1 == null)
        return 1;
    if(num2 == null)
        return -1;
    return ((num1 < num2) ? -1 : ((num1 > num2) ? 1 : 0));
	},
    "non-empty-number-desc": function (num1, num2) {
    if(num1 == null)
        return 1;
    if(num2 == null)
        return -1;
    return ((num1 < num2) ? 1 : ((num1 > num2) ? -1 : 0));
	}
} );




$('#schoolTable').DataTable({
	"scrollX" : true,
	"columns" : [ {
		"data" : "schoolName",
		"render" : function(data, type, row, meta){
				return '<a href="/CollegeSearch/school/searchSchoolByName/'+data+' "target="_blank">'+data+'</a>';
		}
	}, {
		"data" : "rankOverall",
		"render" : function(data, type, row, meta){
			if(data<=0){
				return null;
			}else{
				return data;
			}
		}
	}, {
		"data" : "totalCost",		
		"render" : function(data, type, row, meta){
			if(data <= 0){
				return null;
			}else{
				return data;
			}
		}
	}, {
		"data" : "averageGpa",
		"render" : function(data, type, row, meta){
			if(data <= 0){
				return null;
			}else{
				return data;
			}
		}
	}, {
		"data" : "sat125and75",
		"render" : function(data, type, row, meta){
			if(data == '-- / --' || data == '0 / 0'){
				return null;
			}else{
				return data;
			}
		}
	}, {
		"data" : "toeflMinAndAvg",
		"render" : function(data, type, row, meta){
			if(data == '-- / --' || data == '0 / 0' || data == '0 / --' || data == 'UNKNOWN'){
				return null;
			}else{
				return data;
			}
		}
	}, {
		"data" : "applicationDeadline"
	}, {
		"data" : "state"
	}, {
		"data" : "acceptRate"
	}, {
		"data" : "type"
	}, {
		"data" : "setting"
	}, {
		"data" : "category"
	}, {
		"data" : "size",
		"render" : function(data, type, row, meta){
			if(data <= 0 || data == null){
				return null;
			}else{
				return data;
			}
		}
	}, ],
	"language" : {
		"emptyTable" : "Please Search By The Option Above"
	},
    "columnDefs": [
    	{type: 'non-empty-number', targets: 1},
    	{type: 'non-empty-number', targets: 2},
    	{type: 'non-empty-number', targets: 3},
    	{type: 'non-empty-string', targets: 4},
    	{type: 'non-empty-string', targets: 5},
    	{type: 'non-empty-string', targets: 6},
    	{type: 'non-empty-number', targets: 8},
      	{type: 'non-empty-string', targets: 9}, 
       	{type: 'non-empty-string', targets: 10} 
    ]

});
$('#getCriteria').on('click', function(event){
  var query = new Object();
	if($('#GPA').val() !=''){
	  if( !isNaN( $('#GPA').val() ) ){
	  	if($('#GPA').val()>4.0 || $('#GPA').val()<0.0){
	  		alert("Please enter your GPA between 0 ~ 4.0");
	  		return;
	  	}else{
	  	query["averageGpa"] = $("#GPA").val().toString();
	  	}
	  }else{
	  	alert("Please enter a vaild GPA!");
	  	return;
	  }
	}

  var LanguageTest = $('#ms-LanguageTest').magicSuggest().getSelection();
  if(LanguageTest.length != 0){
    if(!isNaN($('#LanguageScore').val())){
      query[LanguageTest[0].name.toLowerCase()]=$('#LanguageScore').val().toString();
    }else{
      alert("Please enter a vaild "+LanguageTest[0].name+" score!");
      return;
    }
  }

   var test = $('#ms-Test').magicSuggest().getSelection();
  if(test.length != 0){
    if(!isNaN($('#Reading').val())){
      query[test[0].name.toLowerCase()]=(parseInt($('#Reading').val()) + parseInt($('#Math').val()) + parseInt($('#Essay').val())).toString();
    }else{
      alert("Please enter a vaild "+test[0].name+" score!");
      return;
    }
  }

  var sat2List = $('#ms-SatII').magicSuggest().getSelection();
	if(sat2List.length != 0){
    let tmpArr = [];
    for(let i = 0 ; i < sat2List.length ; i++){
      tmpArr.push(sat2List[i].name);
    }
    query["satII"]=tmpArr;
	}

  var stateList = $('#ms-State').magicSuggest().getSelection();
  if(stateList.length != 0){
    let tmpArr = [];
    for(let i = 0 ; i < stateList.length ; i++){
      tmpArr.push(stateList[i].value);
    }
    query["state"]=tmpArr;
  }

  if($('#topRank').val() != ""){
    if(!isNaN($('#topRank').val()))
    query['topRank']=$('#topRank').val();
  }
  if($('#bottomRank').val() != ""){
    if(!isNaN($('#bottomRank').val()))
    query['bottomRank']=$('#bottomRank').val();
  }

  var cost = $("#ms-Cost").magicSuggest().getSelection();
  if(cost.length != 0){
  	query["tuitionFee"] = cost[0].name.substring(3);
  }

  var acceptanceRate = $("#ms-AcceptRate").magicSuggest().getSelection();
  if(acceptanceRate.length != 0){
  	let tmpArr = [];
  	for(let i = 0 ; i < acceptanceRate.length ; i++){
      tmpArr.push((acceptanceRate[i].value-25).toString() + ":" + acceptanceRate[i].value.toString());
    }
  	query["acceptRate"] = tmpArr;
  }

  var type = $("#ms-Type").magicSuggest().getSelection();
  if(type.length != 0){
  	let tmpArr = [];
    for(let i = 0 ; i < type.length ; i++){
      tmpArr.push(type[i].name);
    }
    query["type"]=tmpArr;
  }

  var setting = $("#ms-Setting").magicSuggest().getSelection();
  if(setting.length != 0){
  	let tmpArr = [];
    for(let i = 0 ; i < setting.length ; i++){
      tmpArr.push(setting[i].name);
    }
    query["setting"]=tmpArr;
  }

  var Category = $("#ms-Category").magicSuggest().getSelection();
  if(Category.length != 0){
  	let tmpArr = [];
    for(let i = 0 ; i < Category.length ; i++){
	    tmpArr.push(Category[i].value);
	}
    query["category"]=tmpArr;
  }

  var size = $("#ms-Size").magicSuggest().getSelection();
  if(size.length != 0){
  	let tmpArr = [];
    for(let i = 0 ; i < size.length ; i++){
	    if(size[i].name == "Big"){
	    	tmpArr.push("5000:9999999"); 		//set a big number be the upper limit
	    }else if(size[i].name == "Medium"){
	    	tmpArr.push("2000:5000");
	    }else{
	    	tmpArr.push("0:2000");
	    }
	}
    query["size"]=tmpArr;
  }


    $.ajax({
      type: "POST",
      url: "school/searchSchools",
      data: JSON.stringify(query),
      contentType :   'application/json',
      dataType: "json",
         success: function(result){
	    	var table=$('#schoolTable').DataTable();
	    	table.clear().draw();
	    	table.rows.add(result).draw();
	    	$.notify(
	        {
	          icon: 'glyphicon glyphicon-ok',
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

