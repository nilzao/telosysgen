Ext.define('TelosysGen.view.grid.Link', {
    extend: 'TelosysGen.view.grid.gen.LinkGen',
    xtype: 'link-grid',
    initComponent: function () {
        this.callParent();
        this.getDockedComponent('gridtbar').add(
            {xtype: 'tbar.table.combo'}
        )
    }
});
