#!/bin/bash
mvn -e dbflute:download
wait
cp -f dbflute-ext/templates/om/java/allcommon/ImplementedBehaviorSelector.vm mydbflute/dbflute-1.2.3/templates/om/java/allcommon
cp -f dbflute-ext/templates/om/java/bsentity/BaseEntity.vm mydbflute/dbflute-1.2.3/templates/om/java/bsentity
