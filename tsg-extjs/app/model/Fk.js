Ext.define('TelosysGen.model.Fk', {
	extend : 'Ext.data.Model',
	alias : 'model.fk',
	fields : [ {
		name : 'id',
		type : 'int'
	}, {
		name : 'name',
		type : 'string'
	}, {
		name : 'fkcol',
		type : 'string'
	} ]
});
