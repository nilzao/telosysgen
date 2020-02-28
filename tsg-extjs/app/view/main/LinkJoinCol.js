Ext.define('TelosysGen.view.main.LinkJoinCol', {
	extend : 'Ext.grid.Panel',
	xtype : 'linkjoincollist',
	requires : [ 'TelosysGen.store.Link', 'TelosysGen.view.grid.tbar.GridTbar', 'TelosysGen.store.LinkJoinCol', 'TelosysGen.view.grid.tbar.LinkCombo' ],
	minHeight : 400,
	title : 'Link Join Columns',
	autoLoad : true,
	store : {
		type : 'linkjoincol'
	},
	tbar : {
		items : [ {
			xtype : 'gridtbar'
		}, {
			xtype : 'tbar.link.combo'
		} ]
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'Name',
		dataIndex : 'name',
		editor : 'textfield',
		flex : 1
	}, {
		text : 'referencedColumnName',
		dataIndex : 'referencedColumnName',
		editor : 'textfield',
		flex : 1
	}, {
		text : 'insertable',
		dataIndex : 'insertable',
		editor : 'textfield'
	}, {
		text : 'nullable',
		dataIndex : 'nullable',
		editor : 'textfield'
	}, {
		text : 'unique',
		dataIndex : 'unique',
		editor : 'textfield'
	}, {
		text : 'updatable',
		dataIndex : 'updatable',
		editor : 'textfield'
	} ],
	plugins : {
		ptype : 'rowediting',
		clicksToEdit : 2
	},
	bbar : {
		xtype : 'pagingtoolbar',
		displayInfo : true
	}
});
