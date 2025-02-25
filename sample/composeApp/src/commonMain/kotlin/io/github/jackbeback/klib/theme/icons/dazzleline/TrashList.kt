package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TrashList: ImageVector
    get() {
        if (_TrashList != null) {
            return _TrashList!!
        }
        _TrashList = ImageVector.Builder(
            name = "TrashList",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10f)
                verticalLineTo(17f)
                moveTo(8f, 10f)
                verticalLineTo(17f)
                moveTo(19f, 9f)
                horizontalLineTo(22f)
                moveTo(19f, 14f)
                horizontalLineTo(22f)
                moveTo(19f, 19f)
                horizontalLineTo(21f)
                moveTo(16f, 6f)
                verticalLineTo(16.2f)
                curveTo(16f, 17.88f, 16f, 18.72f, 15.673f, 19.362f)
                curveTo(15.385f, 19.927f, 14.927f, 20.385f, 14.362f, 20.673f)
                curveTo(13.72f, 21f, 12.88f, 21f, 11.2f, 21f)
                horizontalLineTo(8.8f)
                curveTo(7.12f, 21f, 6.28f, 21f, 5.638f, 20.673f)
                curveTo(5.074f, 20.385f, 4.615f, 19.927f, 4.327f, 19.362f)
                curveTo(4f, 18.72f, 4f, 17.88f, 4f, 16.2f)
                verticalLineTo(6f)
                moveTo(2f, 6f)
                horizontalLineTo(18f)
                moveTo(14f, 6f)
                lineTo(13.729f, 5.188f)
                curveTo(13.467f, 4.401f, 13.336f, 4.008f, 13.093f, 3.717f)
                curveTo(12.878f, 3.46f, 12.602f, 3.261f, 12.29f, 3.139f)
                curveTo(11.938f, 3f, 11.523f, 3f, 10.694f, 3f)
                horizontalLineTo(9.306f)
                curveTo(8.477f, 3f, 8.062f, 3f, 7.71f, 3.139f)
                curveTo(7.398f, 3.261f, 7.122f, 3.46f, 6.907f, 3.717f)
                curveTo(6.664f, 4.008f, 6.533f, 4.401f, 6.271f, 5.188f)
                lineTo(6f, 6f)
            }
        }.build()

        return _TrashList!!
    }

@Suppress("ObjectPropertyName")
private var _TrashList: ImageVector? = null
