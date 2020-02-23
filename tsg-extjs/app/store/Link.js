Ext.define('TelosysGen.store.Link', {
	extend : 'Ext.data.Store',
	alias : 'store.link',
	model : 'TelosysGen.model.Link',
	proxy : {
		type : 'rest',
		url : 'http://localhost:8080/link',
		reader : {
			type : 'json',
			rootProperty : '_embedded.link'
		}
	}
});