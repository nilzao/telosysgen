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

	requires : [ 'Ext.data.proxy.Rest', 'TelosysGen.view.main.Database', 'TelosysGen.view.main.Table', 'TelosysGen.view.main.Column', 'TelosysGen.view.main.Fk', 'TelosysGen.view.main.Link', 'TelosysGen.view.main.FkCol',
			'TelosysGen.view.main.LinkJoinCol' ],
	layout : 'border',
	id : 'mainLayout',
	bodyBorder : false,

	defaults : {
		split : true,
		bodyPadding : 10,
		id : 'contentwindow',
		margin : '5 0 0 0'
	},

	items : [ {
		title : 'TelosysGen',
		region : 'west',
		id : 'menuwindow',
		floatable : false,
		collapsible : true,
		// collapseMode : 'mini',
		width : 210,
		minWidth : 100,
		maxWidth : 250,

		rootVisible : true,
		columnLines : true,
		rowLines : true,
		xtype : 'treepanel',
		useArrows : true,
		listeners : {
			itemclick : function(thisObj, record, item, index, e, eOpts) {
				// var contentwindow = Ext.getCmp('contentwindow');
				// contentwindow.removeAll(true);
				if (typeof record.getData().xtypeTmp !== 'undefined') {
					// contentwindow.add({
					// xtype : record.getData().xtypeTmp
					// });
					var mainlayout = Ext.getCmp('mainLayout');
					mainlayout.remove(Ext.getCmp('contentwindow'));
					mainlayout.add({
						xtype : record.getData().xtypeTmp,
						region : 'center'
					});
				}
			}
		},
		store : {
			root : {
				expanded : true,
				expandable : false,
				text : 'database',
				xtypeTmp : 'databaselist',
				children : [ {
					expanded : true,
					expandable : false,
					text : 'tables',
					xtypeTmp : 'tablelist',
					children : [ {
						text : 'columns',
						xtypeTmp : 'columnlist',
						leaf : true
					}, {
						text : 'fks',
						expanded : true,
						xtypeTmp : 'fklist',
						children : [ {
							text : 'fkCols',
							xtypeTmp : 'fkcollist',
							leaf : true
						} ]
					}, {
						text : 'links',
						xtypeTmp : 'linklist',
						expanded : true,
						children : [ {
							text : 'linkJoinCols',
							xtypeTmp : 'linkjoincollist',
							leaf : true
						} ]
					} ]
				} ]
			}
		},
	}, {
		title : 'Main Content',
		collapsible : false,
		region : 'center',
		items : {
			html : '<h2>Main Page</h2><p>This is where the main content would go</p>'
		}
	} ]
});
