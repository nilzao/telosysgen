Ext.define('TelosysGen.view.main.Column.js', {
	extend : 'Ext.grid.Panel',
	xtype : 'columnlist',
	requires : [ 'TelosysGen.store.Column' ],

	title : 'Column',
	autoLoad : true,
	store : {
		type : 'column'
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'Name',
		dataIndex : 'name'
	} ]
});
