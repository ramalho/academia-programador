for i in range(128, 160):
    try:
        print u'%d: %s,' % (i, repr(chr(i).decode('cp1252'))[1:]),
    except UnicodeDecodeError:
        pass
