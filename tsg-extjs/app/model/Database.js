Ext.define('TelosysGen.model.Database', {
	extend : 'Ext.data.Model',
	alias : 'model.database',
	fields : [ {
		name : 'id',
		type : 'int'
	}, {
		name : 'databaseName',
		type : 'string'
	}, {
		name : 'databaseProductName',
		type : 'string'
	}, {
		name : 'generation',
		type : 'date'
	} ]
});
