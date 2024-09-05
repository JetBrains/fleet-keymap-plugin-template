plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {

    // STEP 1: chose an ID for your plugin, it must be unique
    //
    id = "titouan.bion.test.plugin7"

    // STEP 2: set up the sensible metadata for your plugin
    metadata {
        readableName = "Some test of Titouan 7"
        description = "Your plugin description here"
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }

    // STEP 3: add publishing information
    publishing {
//      vendorId = "773b5309-867b-4724-92c8-0760db075bc0"
    //     licenseUrl = "your-license-url-here"
    //     sourceCodeUrl = "your-source-repository-url-here"
    }
}
