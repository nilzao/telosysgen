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
	} ],
	proxy : {
		type : 'rest',
		url : TelosysGen.Vars.baseStoreProxyUrl + '/database',
		api : {
			create : TelosysGen.Vars.baseStoreProxyUrl + '/database',
			update : TelosysGen.Vars.baseStoreProxyUrl + '/database',
			destroy : TelosysGen.Vars.baseStoreProxyUrl + '/database'
		},
		reader : {
			type : 'json',
			rootProperty : '_embedded.database',
			totalProperty : 'page.totalElements'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});
