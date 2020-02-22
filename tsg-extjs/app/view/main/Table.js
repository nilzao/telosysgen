Ext.define('TelosysGen.view.main.Table', {
	extend : 'Ext.grid.Panel',
	xtype : 'tablelist',
	requires : [ 'TelosysGen.store.Table' ],

	title : 'Tables',
	autoLoad : true,
	store : {
		type : 'table'
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'Name',
		dataIndex : 'name'
	} ]
});
