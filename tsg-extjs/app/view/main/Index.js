/**
 * This class is the main view for the application. It is specified in app.js as
 * the "mainView" property. That setting automatically applies the "viewport"
 * plugin causing this view to become the body element (i.e., the viewport).
 * 
 * TODO - Replace this content of this view to suite the needs of your
 * application.
 */
Ext.define('TelosysGen.view.main.Index', {
	extend : 'Ext.tab.Panel',
	xtype : 'app-index',

	requires : [ 'Ext.plugin.Viewport', 'Ext.window.MessageBox', 'TelosysGen.view.main.MainController', 'TelosysGen.view.main.MainModel', 'TelosysGen.view.main.List', 'TelosysGen.view.main.Table' ],

	controller : 'main',
	viewModel : 'main',

	ui : 'navigation',

	tabBarHeaderPosition : 1,
	titleRotation : 0,
	tabRotation : 0,

	header : {
		layout : {
			align : 'stretchmax'
		},
		title : {
			bind : {
				text : '{name}'
			},
			flex : 0
		},
		iconCls : 'x-fa fa-th-list'
	},

	tabBar : {
		flex : 1,
		layout : {
			align : 'stretch',
			overflowHandler : 'none'
		}
	},

	responsiveConfig : {
		tall : {
			headerPosition : 'top'
		},
		wide : {
			headerPosition : 'left'
		}
	},

	defaults : {
		bodyPadding : 20,
		tabConfig : {
			responsiveConfig : {
				wide : {
					iconAlign : 'left',
					textAlign : 'left'
				},
				tall : {
					iconAlign : 'top',
					textAlign : 'center',
					width : 120
				}
			}
		}
	},

	items : [ {
		title : 'Settings',
		iconCls : 'x-fa fa-cog',
		items : [ {
			xtype : 'tablelist'
		} ]
	}, {
		title : 'Home',
		iconCls : 'x-fa fa-home',
		// The following grid shares a store with the classic version's grid as
		// well!
		items : [ {
			xtype : 'mainlist'
		} ]
	}, {
		title : 'Users',
		iconCls : 'x-fa fa-user',
		bind : {
			html : '{loremIpsum}'
		}
	}, {
		title : 'Groups',
		iconCls : 'x-fa fa-users',
		bind : {
			html : '{loremIpsum}'
		}
	} ],
	bbar : {
		xtype : 'pagingtoolbar',
		displayInfo : true
	}
});