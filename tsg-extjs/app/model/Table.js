Ext.define('TelosysGen.model.Table', {
	extend : 'Ext.data.Model',
	alias : 'model.table',
	fields : [ {
		name : 'id',
		type : 'int'
	}, {
		name : 'name',
		type : 'string'
	}, {
		name : 'javaBean',
		type : 'string'
	}, {
		name : 'schema',
		type : 'string'
	}, {
		name : 'catalog',
		type : 'string'
	}, {
		name : 'databaseComment',
		type : 'string'
	}, {
		name : 'databaseType',
		type : 'string'
	} ]
});
