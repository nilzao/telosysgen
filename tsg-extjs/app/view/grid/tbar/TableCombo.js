Ext.define('TelosysGen.view.grid.tbar.TableCombo', {
    extend: 'TelosysGen.view.grid.tbar.gen.TableComboGen',
    xtype: 'tbar.table.combo',
    // extjs default queryParam: 'query'
    queryParam: 'query',
    // extjs default displayField: 'text'
    displayField: 'name',
    // TableComboGen default queryPath: '/search/findByQuery'
    urlSearchApiQueryPath: '/search/findByQuery'
});
