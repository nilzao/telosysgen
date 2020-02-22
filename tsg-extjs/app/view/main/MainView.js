/**
 * This class is the main view for the application. It is specified in app.js as
 * the "mainView" property. That setting automatically applies the "viewport"
 * plugin causing this view to become the body element (i.e., the viewport).
 * 
 * TODO - Replace this content of this view to suite the needs of your
 * application.
 */
Ext.define('TelosysGen.view.main.MainView', {
	extend : 'Ext.container.Viewport',
	xtype : 'app-main-view',

	requires : [ 'TelosysGen.view.main.Table' ],
	layout : 'border',

	bodyBorder : false,

	defaults : {
		split : true,
		bodyPadding : 10
	},

	items : [ {
		title : 'Navigation',
		region : 'west',
		id : 'navigationtab',
		floatable : false,
		collapsible : true,
		// collapseMode : 'mini',
		margin : '5 0 0 0',
		width : 200,
		minWidth : 100,
		maxWidth : 250,
		

		rootVisible : true,
		xtype : 'treepanel',
		align: 'left',
		title:'Navigation',
		listeners : {
			itemclick : function(thisObj, record, item, index, e, eOpts) {
				var contentwindow = Ext.getCmp('contentwindow');
				contentwindow.removeAll(true);
				console.log(record);
				if (typeof record.getData().xtypeTmp !== 'undefined') {
					console.log(record.getData().xtypeTmp);
					contentwindow.add({
						xtype : record.getData().xtypeTmp
					});
				}
			}
		},
		store : {
			root : {
				expanded : true,
				children : [ {
					text : 'detention',
					leaf : true,
					iconCls : 'x-fa fa-frown-o'
				}, {
					text : 'homework',
					expanded : true,
					iconCls : 'x-fa fa-folder',
					children : [ {
						text : 'book report',
						leaf : true,
						iconCls : 'x-fa fa-book'
					}, {
						text : 'algebra',
						leaf : true,
						iconCls : 'x-fa fa-graduation-cap'
					} ]
				}, {
					text : 'buy lottery tickets',
					leaf : true,
					xtypeTmp : 'tablelist',
					iconCls : 'x-fa fa-usd'
				} ]
			}
		},
	
		
		
	}, {
		title : 'Main Content',
		id : 'contentwindow',
		collapsible : false,
		region : 'center',
		margin : '5 0 0 0',
		items : {
			html : '<h2>Main Page</h2><p>This is where the main content would go</p>'
		}
	} ]
});
