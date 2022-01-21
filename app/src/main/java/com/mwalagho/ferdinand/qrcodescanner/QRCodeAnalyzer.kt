package com.mwalagho.ferdinand.qrcodescanner

import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy

class QRCodeAnalyzer(
    val onQrCodeScanned: (String) -> Unit
): ImageAnalysis.Analyzer{

    override fun analyze(image: ImageProxy) {
        TODO("Not yet implemented")
    }
}